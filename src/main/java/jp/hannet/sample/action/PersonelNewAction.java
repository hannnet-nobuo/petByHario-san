package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;
import jp.hannet.sample.model.PersonelMapping;
import jp.hannet.sample.dao.PersonelDao;


public class PersonelNewAction extends ActionSupport {
	private static final long serialVersionUID = 5294876177832560670L;
	private Integer id;
	private String name;
	private String number;
	private String insert;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return number;
	}

	public void setMemo(String number) {
		this.number = number;
	}

	public String getInsert() {
		return insert;
	}

	public void setInsert(String insert) {
		this.insert = insert;
	}

	public String execute() throws Exception {
		msg = "";
		PersonelDao dao = new PersonelDao();
		
			// セッション取得
			
		if (name !=null && number != null) {
			PersonelMapping map = new PersonelMapping();
			map.setId(id);
			map.setName(name);
			map.setMemo(number);
			dao.save(map);
			msg = "書き込みました";
		} else {
			msg = "";
			
		}
			
		
		return SUCCESS;
	}

}
