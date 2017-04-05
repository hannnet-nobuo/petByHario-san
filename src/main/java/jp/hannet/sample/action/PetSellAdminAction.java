package jp.hannet.sample.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PetSellAdminAction extends ActionSupport {
	
	private static final long serialVersionUID = -3521141713234828082L;
	
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

}
