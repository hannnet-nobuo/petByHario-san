package jp.hannet.sample.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PetReserveAdminAction extends ActionSupport {
	
	private static final long serialVersionUID = -3521141713234828082L;
	
	private Integer reserveId;
	private String startYmd;
	private String endYmd;
	private String checkInYmd;
	private String checkOutYmd;
	private Integer sellNo;
	private Date insYmd;
	private Date updYmd;

}
