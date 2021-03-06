package jp.hannet.sample.action;

import java.util.Date;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetItemEditDao;
import jp.hannet.sample.model.PetItemAttributeMapping;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemEditAction extends ActionSupport implements HttpParametersAware{
	
	private static final long serialVersionUID = -3521141713234828082L;
	
	private String itemCd;
	private String itemName;
	private PetItemAttributeMapping itemAttribute;
	private double itemCost;
	private double itemPrice;
	private String insYmd;
	private String updYmd;
	private String editid;
	private HttpParameters param;
	private String delid;
	private String update;
	
	private PetItemAttributeMapping petItemAttribute;
	
	public String getItemCd() {
		return itemCd;
	}
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public PetItemAttributeMapping getItemAttribute() {
		return itemAttribute;
	}
	public void setItemAttribute(PetItemAttributeMapping itemAttribute) {
		this.itemAttribute = itemAttribute;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
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
	public String getDelid() {
		return delid;
	}

	public void setDelid(String delid) {
		this.delid = delid;
	}
	
	
	public PetItemAttributeMapping getPetItemAttribute() {
		return petItemAttribute;
	}
	public void setPetItemAttribute(PetItemAttributeMapping petItemAttribute) {
		this.petItemAttribute = petItemAttribute;
	}
	public String execute() throws Exception {
		PetItemEditDao dao = new PetItemEditDao();

		if (param.contains("editid")) {
			editid =  param.get("editid").getValue();
		}
			
		if (editid != null) {
			// 結果取得
			
			PetItemMapping map = dao.selectById(editid);
			itemCd = map.getItemCd();
			itemName = map.getItemName();
			petItemAttribute = map.getPetItemAttributeMapping();
		} else if (update != null && itemCd != null) {
			PetItemMapping map = new PetItemMapping();
			map.setItemCd(itemCd);
			map.setItemName(itemName);
			map.setPetItemAttributeMapping(itemAttribute);
			map.setUpdYmd(new Date());
			dao.update(map);
		}
		
		if (delid != null && itemCd !=null) {
			PetItemMapping delMap = new PetItemMapping();
			delMap.setItemCd(itemCd);
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
