package jp.hannet.sample.action;

import java.util.Date;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetUserEditDao;
import jp.hannet.sample.model.PetUserMapping;

public class PetUserEditAction extends ActionSupport implements HttpParametersAware{
	
	private static final long serialVersionUID = -3521141713234828082L;
	private String editid;
	private Integer userId;
	private String userName;
	private String userPass;
	private String insYmd;
	private String updYmd;
	private String update;
	private HttpParameters param;
	private String delete;
	
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

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
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
	

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String execute() throws Exception {
		PetUserEditDao dao = new PetUserEditDao();

		if (param.contains("editid")) {
			editid =  param.get("editid").getValue();
		}
			
		if (editid != null) {
			// 結果取得
			int num1 = Integer.parseInt( editid );
			PetUserMapping map = dao.selectById(num1);
			userId = map.getUserId();
			userName = map.getUserName();
			userPass = map.getUserPass();
		} else if (update != null && userId != null) {
			PetUserMapping map = new PetUserMapping();
			map.setUserId(userId);
			map.setUserName(userName);
			map.setUserPass(userPass);
			map.setUpdYmd(new Date());
			dao.update(map);
		}
		
		if (this.delete != null && userId != null) {
			PetUserMapping delMap = new PetUserMapping();
			delMap.setUserId(userId);
			// 削除
			dao.delete(delMap);
			return "deletescceed";
		}

        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}

}
