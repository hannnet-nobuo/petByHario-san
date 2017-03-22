package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PetItemNewDao;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemNewAction extends ActionSupport {
	
private static final long serialVersionUID = -3521141713234828082L;
	
	private String itemCd;
	private String itemName;
	private Integer itemAttribute;
	private double itemCost;
	private double itemPrice;
	private String insYmd;
	private String updYmd;
	private String msg;
	private String insert;
	
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getInsert() {
		return insert;
	}
	public void setInsert(String insert) {
		this.insert = insert;
	}
	
	public String execute() throws Exception {
		msg = "";
		PetItemNewDao dao = new PetItemNewDao();
		
			// セッション取得
			
		if (itemCd !=null && itemName != null) {
			PetItemMapping map = new PetItemMapping();
			map.setItemCd(itemCd);
			map.setItemName(itemName);
			map.setItemAttribute(itemAttribute);
			map.setItemCost(itemCost);
			map.setItemPrice(itemPrice);
			dao.save(map);
			msg = "書き込みました";
		} else {
			msg = "";
			
		}
			
		
		return SUCCESS;
	}

}
