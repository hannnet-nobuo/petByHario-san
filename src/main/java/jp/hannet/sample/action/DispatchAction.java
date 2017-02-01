package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;

public class DispatchAction extends ActionSupport {
	
	private static final long serialVersionUID = -2295561907542607361L;
	
	private String text;
	
	public String getText() {
		return text;
	}
	
	public String action1() throws Exception {
		text = "acton1";
		return SUCCESS;
	}
	
	public String action2() throws Exception {
		text = "action2";
		return SUCCESS;
	}
}
