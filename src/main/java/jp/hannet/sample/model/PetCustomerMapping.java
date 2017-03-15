package jp.hannet.sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "customer" )

public class PetCustomerMapping implements Serializable {
	
	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="customerId")
	
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
	private Date insYmd;
	private Date updYmd;
	
	
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
	public Date getInsYmd() {
		return insYmd;
	}
	public void setInsYmd(Date insYmd) {
		this.insYmd = insYmd;
	}
	public Date getUpdYmd() {
		return updYmd;
	}
	public void setUpdYmd(Date updYmd) {
		this.updYmd = updYmd;
	}





}
