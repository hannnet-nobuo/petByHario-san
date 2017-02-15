package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetCustomerNewDao;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerNewAction extends ActionSupport {

	private static final long serialVersionUID = 5294876177832560670L;
	private Integer customerId;
	private String customerName;
	private String customerPass;
	private String insert;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPass() {
		return customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public String getInsert() {
		return insert;
	}

	public void setInsert(String insert) {
		this.insert = insert;
	}

	public String execute() throws Exception {
		msg = "";
		PetCustomerNewDao dao = new PetCustomerNewDao();
		
			// セッション取得
			
		if (customerName !=null && customerPass != null) {
			PetCustomerMapping map = new PetCustomerMapping();
			map.setCustomerId(customerId);
			map.setCustomerName(customerName);
			map.setCustomerPass(customerPass);
			dao.save(map);
			msg = "書き込みました";
		} else {
			msg = "";
			
		}
			
		
		return SUCCESS;
	}

}
