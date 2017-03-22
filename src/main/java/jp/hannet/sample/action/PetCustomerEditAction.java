package jp.hannet.sample.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetCustomerEditDao;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerEditAction extends ActionSupport implements HttpParametersAware{
	
	private static final long serialVersionUID = -3521141713234828082L;
	private String editid;
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
	private String update;
	private HttpParameters param;
	private String delete;
	private String insYmd;
	private String updYmd;
	
	private List<String> selectSex;
	
	
	public List<String> getSelectSex() {
		return selectSex;
	}

	public void setSelectSex(List<String> selectSex) {
		this.selectSex = selectSex;
	}
	
	public void SelectAction(){
		
		selectSex = new ArrayList<String>();
		selectSex.add("M");
		selectSex.add("F");
	}

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

	public String getBirthYmd() {
		return birthYmd;
	}

	public void setBirthYmd(String birthYmd) {
		this.birthYmd = birthYmd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	
	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
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
			customerKana = map.getCustomerKana();
			sex = map.getSex();
			postCd = map.getPostCd();
			address1 =map.getAddress1();
			address2 =map.getAddress2();
			address3 =map.getAddress3();
			address4 =map.getAddress4();
			tel = map.getTel();
			email = map.getEmail();
			birthYmd = map.getBirthYmd();
			
		} else if (update != null && customerId != null) {
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
			
			dao.update(map);
		}
		
		if (this.delete != null && customerId !=null	) {
			PetCustomerMapping delMap = new PetCustomerMapping();
			delMap.setCustomerId(customerId);
			// 削除
			dao.delete(delMap);
		}

        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}
}
