package jp.hannet.sample.action;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetCustomerEditDao;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerEditAction extends ActionSupport {
	
	private static final long serialVersionUID = -3521141713234828082L;
	private String editid;
	private Integer customerId;
	private String customerName;
	private String customerPass;
	private String update;
	private HttpParameters param;
	private Integer delid;
	
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

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	
	public Integer getDelid() {
		return delid;
	}

	public void setDelid(Integer delid) {
		this.delid = delid;
	}

	
	



	public String execute() throws Exception {
		PetCustomerEditDao dao = new PetCustomerEditDao();

		if (param.contains("editid")) {
			editid =  param.get("editid").getValue();
		}
			
		if (editid != null) {
			// 結果取得
			int num1 = Integer.parseInt( editid );
			PetCustomerMapping map = dao.selectById(num1);
			customerId = map.getCustomerId();
			customerName = map.getCustomerName();
			customerPass = map.getCustomerPass();
		} else if (update != null && customerId != null) {
			PetCustomerMapping map = new PetCustomerMapping();
			map.setCustomerId(customerId);
			map.setCustomerName(customerName);
			map.setCustomerPass(customerPass);
			dao.update(map);
		}
		
		if (this.delid != null) {
			PetCustomerMapping delMap = new PetCustomerMapping();
			delMap.setCustomerId(delid);
			// 削除
			dao.delete(delMap);
		}

        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}
}
