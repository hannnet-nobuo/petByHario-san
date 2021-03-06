package jp.hannet.sample.action;

import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PersonelDao;
import jp.hannet.sample.dao.PetItemAdminDao;
import jp.hannet.sample.dao.PetUserAdminDao;
import jp.hannet.sample.model.MyMapping;
import jp.hannet.sample.model.PersonelMapping;
import jp.hannet.sample.model.PetCustomerMapping;
import jp.hannet.sample.model.PetItemAttributeMapping;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemAdminAction extends ActionSupport {
	
private static final long serialVersionUID = -3521141713234828082L;
	
	private String itemCd ;
	private String itemAttributeName;
	private PetItemAttributeMapping petItemAttributeMapping;
	private String itemName;
	private String s_id;
	private List<PetItemMapping> itemMappings;
	
	
	
	public String getItemCd() {
		return itemCd;
	}
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}
	public String getItemAttributeName() {
		return itemAttributeName;
	}
	public void setItemAttributeName(String itemAttributeName) {
		this.itemAttributeName = itemAttributeName;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	public List<PetItemMapping> getItems() {
		return itemMappings;
	}
	
	public PetItemAttributeMapping getPetItemAttributeMapping() {
		return petItemAttributeMapping;
	}
	public void setPetItemAttributeMapping (PetItemAttributeMapping petItemAttributeMapping) {
		this.petItemAttributeMapping = petItemAttributeMapping;
	}
	
	
	public String execute() throws Exception {
		
		PetItemAdminDao dao = new PetItemAdminDao ();
		itemMappings = dao.likeById(s_id);
		return SUCCESS;
	}


}
