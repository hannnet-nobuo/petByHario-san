package jp.hannet.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "item_attribute" )


public class PetItemAttributeMapping implements Serializable {
	
	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	
    @Column(name="itemAttributeNumber")
	
	private Integer itemAttributeNumber;
	private String itemAttributeName;
	
	
	public Integer getItemAttributeNumber() {
		return itemAttributeNumber;
	}
	public void setItemAttributeNumber(Integer itemAttributeNumber) {
		this.itemAttributeNumber = itemAttributeNumber;
	}
	public String getItemAttributeName() {
		return itemAttributeName;
	}
	public void setItemAttributeName(String itemAttributeName) {
		this.itemAttributeName = itemAttributeName;
	}



}
