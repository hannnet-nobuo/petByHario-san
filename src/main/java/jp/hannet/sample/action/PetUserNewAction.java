package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.model.PetUserMapping;
import jp.hannet.sample.dao.PetUserNewDao;


public class PetUserNewAction extends ActionSupport {

	private static final long serialVersionUID = 5294876177832560670L;
	private Integer userId;
	private String userName;
	private String userPass;
	private String insert;
	private String insYmd;
	private String updYmd;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	public String getInsYmd() {
		return insYmd;
	}

	public void setInsYmd(String insYmd) {
		this.insYmd = insYmd;
	}
	
	public String getUpdYmd() {
		return updYmd;
	}

	public void setUpdYmd(String updYmd) {
		this.updYmd = updYmd;
	}

	public String getInsert() {
		return insert;
	}

	public void setInsert(String insert) {
		this.insert = insert;
	}

	public String execute() throws Exception {
		msg = "";
		PetUserNewDao dao = new PetUserNewDao();
		
			// セッション取得
			
		if (userName !=null && userPass != null) {
			PetUserMapping map = new PetUserMapping();
			map.setUserId(userId);
			map.setUserName(userName);
			map.setUserPass(userPass);
			map.setInsYmd(insYmd);
			map.setUpdYmd(updYmd);
			dao.save(map);
			msg = "書き込みました";
		} else {
			msg = "";
			
		}
			
		
		return SUCCESS;
	}

}
