package jp.hannet.sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "user" )


public class PetUserMapping implements Serializable {

	private static final long serialVersionUID = -5691674981407366694L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userId")
	
	private Integer userId;
	private String userName;
	private String userPass;
	private Date insYmd;
	private Date updYmd;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
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
