package jp.hannet.sample.action;

import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PersonelDao;
import jp.hannet.sample.dao.PetUserAdminDao;
import jp.hannet.sample.model.MyMapping;
import jp.hannet.sample.model.PersonelMapping;
import jp.hannet.sample.model.PetCustomerMapping;
import jp.hannet.sample.model.PetUserMapping;

public class PetUserAdminAction extends ActionSupport {
	
	private static final long serialVersionUID = -3521141713234828082L;
	
	private Integer userId;
	private String userName;
	private Integer s_id;
	private List<PetUserMapping> userMappings;
	
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
	
	public List<PetUserMapping> getUsers() {
		return userMappings;
	}
	
	
	public String execute() throws Exception {
		
		PetUserAdminDao dao = new PetUserAdminDao ();
		userMappings = dao.likeById(s_id);
		return SUCCESS;
	}

}
	

