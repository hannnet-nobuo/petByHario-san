package jp.hannet.sample.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.HttpParametersAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetLoginDao;
import jp.hannet.sample.model.PetUserMapping;

public class PetLoginAction extends ActionSupport  implements SessionAware{
	
	private static final long serialVersionUID = 5294876177832560670L;
	private Integer userId;
	private String userPass;
	private String login; 
	private String msg;
	SessionMap<String,String> sessionmap;
	
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
	
	public void setSession(Map map) {
		// TODO Auto-generated method stub
		sessionmap=(SessionMap)map;
		sessionmap.put("login", "true");
		
	}


	

	
	public String execute() throws Exception {
		msg = "";
			
		PetLoginDao dao = new PetLoginDao();
		PetUserMapping map = new PetUserMapping();
		
		if(userId != null && userPass != null) {
			
			userId = map.getUserId();
			userPass = map.getUserPass();
			
			if(dao.validate(userId, userPass)){  
		        return "login";
	
		    }  
		    else{  
		        return ERROR;  
		    }  
			
			
		} else {
			msg =  "";
			return SUCCESS;
		}
			
	}

}
	

	


