package jp.hannet.sample.action;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PersonelDao;
import jp.hannet.sample.model.PersonelMapping;


public class PersonelEditAction extends ActionSupport implements HttpParametersAware {
	private static final long serialVersionUID = -3521141713234828082L;
	private String editid;
	private Integer id;
	private String name;
	private String number;
	private String update;
	private HttpParameters param;
	
	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getEditid() {
		return editid;
	}

	public void setEditid(String editid) {
		this.editid = editid;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	



	public String execute() throws Exception {
		PersonelDao dao = new PersonelDao();

		if (param.contains("editid")) {
			editid =  param.get("editid").getValue();
		}
			
		if (editid != null) {
			// 結果取得
			int num1 = Integer.parseInt( editid );
			PersonelMapping map = dao.selectById(num1);
			id = map.getId();
			name = map.getName();
			number = map.getMemo();
		} else if (update != null && id != null) {
			PersonelMapping map = new PersonelMapping();
			map.setId(id);
			map.setName(name);
			map.setMemo(number);
			dao.update(map);
		}
        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}

}
