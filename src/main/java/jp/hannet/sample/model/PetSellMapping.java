package jp.hannet.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "sell" )

public class PetSellMapping implements Serializable {
	
	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	
	private Integer sellNo;
	private String sellYmd;
	private Integer customerId;
	private String itemCd;
	private double quantity;
	private double price;
	private double includingTax;
	private double tax;
	private String insYmd;
	private String updYmd;
	
	
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
}
