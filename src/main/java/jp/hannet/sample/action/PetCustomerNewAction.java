package jp.hannet.sample.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetCustomerNewDao;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerNewAction extends ActionSupport {

	private static final long serialVersionUID = 5294876177832560670L;
	private Integer customerId;
	private String customerName;
	private String customerKana;
	private String sex;
	private String postCd;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String tel;
	private String email;
	private String birthYmd;
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

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthYmd() {
		return birthYmd;
	}

	public void setBirthYmd(String birthYmd) {
		this.birthYmd = birthYmd;
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
			
		if (customerName !=null && customerKana != null) {
			PetCustomerMapping map = new PetCustomerMapping();
			map.setCustomerId(customerId);
			map.setCustomerName(customerName);
			map.setCustomerKana(customerKana);
			map.setSex(sex);
			map.setPostCd(postCd);
			map.setAddress1(address1);
			map.setAddress2(address2);
			map.setAddress3(address3);
			map.setAddress4(address4);
			map.setTel(tel);
			map.setEmail(email);
			map.setBirthYmd(birthYmd);
			map.setUpdYmd(new Date());
			dao.save(map);
			msg = "書き込みました";
		} else {
			msg = "";
			
		}
			
		
		return SUCCESS;
	}

}
