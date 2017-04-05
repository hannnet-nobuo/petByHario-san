package jp.hannet.sample.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PetSellNewAction extends ActionSupport {

	private static final long serialVersionUID = 2712985720417533368L;
	
	private Integer sellNo;
	private String sellYmd;
	private Integer customerId;
	private String itemCd;
	private double quantity;
	private double price;
	private double includingTax;
	private double tax;
	private Date insYmd;
	private Date updYmd;
	
	public Integer getSellNo() {
		return sellNo;
	}
	public void setSellNo(Integer sellNo) {
		this.sellNo = sellNo;
	}
	public String getSellYmd() {
		return sellYmd;
	}
	public void setSellYmd(String sellYmd) {
		this.sellYmd = sellYmd;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getItemCd() {
		return itemCd;
	}
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getIncludingTax() {
		return includingTax;
	}
	public void setIncludingTax(double includingTax) {
		this.includingTax = includingTax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
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
