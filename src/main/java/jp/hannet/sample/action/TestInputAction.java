package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestInputAction extends ActionSupport {
	
	private static final long serialVersionUID = -6797984290154675164L;
	
	private String id;
	private String name;
	private String memo;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id  = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo  = memo;
	}
	
	public String execute() throws Exception {
		return SUCCESS;
	}
}
