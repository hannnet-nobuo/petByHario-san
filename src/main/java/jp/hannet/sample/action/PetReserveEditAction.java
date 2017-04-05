package jp.hannet.sample.action;

import java.util.Date;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

public class PetReserveEditAction extends ActionSupport implements HttpParametersAware {
	
	private static final long serialVersionUID = -3521141713234828082L;
	
	private Integer reserveId;
	private String startYmd;
	private String endYmd;
	private String checkInYmd;
	private String checkOutYmd;
	private Integer sellNo;
	private Date insYmd;
	private Date updYmd;

	public void setParameters(HttpParameters parameters) {
		// TODO Auto-generated method stub

	}

	public Integer getReserveId() {
		return reserveId;
	}

	public void setReserveId(Integer reserveId) {
		this.reserveId = reserveId;
	}

	public String getStartYmd() {
		return startYmd;
	}

	public void setStartYmd(String startYmd) {
		this.startYmd = startYmd;
	}

	public String getEndYmd() {
		return endYmd;
	}

	public void setEndYmd(String endYmd) {
		this.endYmd = endYmd;
	}

	public String getCheckInYmd() {
		return checkInYmd;
	}

	public void setCheckInYmd(String checkInYmd) {
		this.checkInYmd = checkInYmd;
	}

	public String getCheckOutYmd() {
		return checkOutYmd;
	}

	public void setCheckOutYmd(String checkOutYmd) {
		this.checkOutYmd = checkOutYmd;
	}

	public Integer getSellNo() {
		return sellNo;
	}

	public void setSellNo(Integer sellNo) {
		this.sellNo = sellNo;
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
