package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetLoginDao;
import jp.hannet.sample.model.PetUserMapping;

public class PetLoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 5294876177832560670L;
	private Integer userId;
	private String userPass;
	private String login; 
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

	public String getUserPass() {
		return userPass;
	}

	public void setName(String userPass) {
		this.userPass = userPass;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


	

	
public String execute() throws Exception {
		
		PetLoginDao dao = new PetLoginDao();
		
		if (userId != null) {
			// セッション取得
			if (dao.existById(userId)) {
				PetUserMapping map = new PetUserMapping();
				map.setUserId(userId);
				map.setUserPass(userPass);
				
			} else {
				msg = "ログイン出来ません";
			}
		}
		return SUCCESS;
	}


}
