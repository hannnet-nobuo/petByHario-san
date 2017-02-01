package jp.hannet.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "reserve" )

public class PetReserveMapping implements Serializable {
	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	
	private Integer reserveId;
	private String startYmd;
	private String endYmd;
	private String checkInYmd;
	private String checkOutYmd;
	private Integer sellNo;
	private String insYmd;
	private String updYmd;
	
	
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
