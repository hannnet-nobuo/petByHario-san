package jp.hannet.sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "item" )


public class PetItemMapping implements Serializable {
	
	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="itemCd")
	
	private String itemCd;
	private String itemName;
	private Integer itemAttribute;
	private double itemCost;
	private double itemPrice;
	private Date insYmd;
	private Date updYmd;
	private Integer itemAttributeNumber;
	
	
	
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
	
	
	@OneToOne
	@JoinColumn(name = "itemAttributeNumber")
	
	private PetItemAttributeMapping petItemAttributeMapping;
	
	public PetItemAttributeMapping getPetItemAttributeMapping() {
		return petItemAttributeMapping;
	}
	
	public void setItemAttributeName(PetItemAttributeMapping petItemAttributeMapping) {
		this.petItemAttributeMapping = petItemAttributeMapping;
	}
	public Integer getItemAttributeNumber() {
		return itemAttributeNumber;
	}
	public void setItemAttributeNumber(Integer itemAttributeNumber) {
		this.itemAttributeNumber = itemAttributeNumber;
	}
	

}
