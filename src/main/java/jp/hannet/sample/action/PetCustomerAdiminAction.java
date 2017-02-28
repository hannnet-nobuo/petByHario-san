package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;


import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;

import jp.hannet.sample.dao.PersonelDao;
import jp.hannet.sample.dao.PetCustomerAdminDao;
import jp.hannet.sample.model.MyMapping;
import jp.hannet.sample.model.PersonelMapping;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerAdiminAction extends ActionSupport {
	
private static final long serialVersionUID = -3521141713234828082L;
	
	private Integer customerId;
	private String customerName;
	private String customerKana;
	private String sex;
	private String postCd;
	private String address1;
	private Integer s_id;
	private List<PetCustomerMapping> customerMappings;
	
	public Integer getUserId() {
		return customerId;
	}
	public void setUserId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerKana() {
		return customerKana;
	}
	public void setCustomerKana(String customerKana) {
		this.customerKana = customerKana;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPostCd() {
		return postCd;
	}
	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public List<PetCustomerMapping> getCustomers() {
		return customerMappings;
	}
	
	
	public String execute() throws Exception {
		
		PetCustomerAdminDao dao = new PetCustomerAdminDao ();
		customerMappings = dao.likeById(s_id);
		return SUCCESS;
	}

}
