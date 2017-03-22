package jp.hannet.sample.action;

import java.util.Date;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetItemEditDao;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemEditAction extends ActionSupport implements HttpParametersAware{
	
	private static final long serialVersionUID = -3521141713234828082L;
	
	private Integer itemCd;
	private String itemName;
	private Integer itemAttribute;
	private double itemCost;
	private double itemPrice;
	private String insYmd;
	private String updYmd;
	private String editid;
	private HttpParameters param;
	private Integer delid;
	private String update;
	
	public Integer getItemCd() {
		return itemCd;
	}
	public void setItemCd(Integer itemCd) {
		this.itemCd = itemCd;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemAttribute() {
		return itemAttribute;
	}
	public void setItemAttribute(Integer itemAttribute) {
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
	public Integer getDelid() {
		return delid;
	}

	public void setDelid(Integer delid) {
		this.delid = delid;
	}
	
	
	public String execute() throws Exception {
		PetItemEditDao dao = new PetItemEditDao();

		if (param.contains("editid")) {
			editid =  param.get("editid").getValue();
		}
			
		if (editid != null) {
			// 結果取得
			int num1 = Integer.parseInt( editid );
			PetItemMapping map = dao.selectById(num1);
			itemCd = map.getItemCd();
			itemName = map.getItemName();
			itemAttribute = map.getItemAttribute();
		} else if (update != null && itemCd != null) {
			PetItemMapping map = new PetItemMapping();
			map.setItemCd(itemCd);
			map.setItemName(itemName);
			map.setItemAttribute(itemAttribute);
			map.setUpdYmd(new Date());
			dao.update(map);
		}
		
		if (this.delid != null) {
			PetItemMapping delMap = new PetItemMapping();
			delMap.setItemCd(delid);
			// 削除
			dao.delete(delMap);
		}

        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}

}
