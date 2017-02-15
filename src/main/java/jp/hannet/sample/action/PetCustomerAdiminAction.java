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
	
	public List<PetCustomerMapping> getCustomers() {
		return customerMappings;
	}
	
	
	public String execute() throws Exception {
		
		PetCustomerAdminDao dao = new PetCustomerAdminDao ();
		customerMappings = dao.likeById(s_id);
		return SUCCESS;
	}

}
