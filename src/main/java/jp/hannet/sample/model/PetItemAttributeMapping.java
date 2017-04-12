package jp.hannet.sample.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
	private Set<PetItemMapping> petItemMapping = new HashSet<PetItemMapping>(0);
	
	
	public PetItemAttributeMapping() {
		
	}
	
	
	
	
	
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
	public Set<PetItemMapping> getPetItemMapping() {
		return petItemMapping;
	}
	public void setPetItemMapping(Set<PetItemMapping> petItemMapping) {
		this.petItemMapping = petItemMapping;
	}
	
}
