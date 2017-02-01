package jp.hannet.sample.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.Conversion;

public class Page2Action extends ActionSupport {
	private static final long serialVerdionUID = -6797984290154675164L;
	public void setClick(String click) {
		this.click = click;
	}
	
	public void setCancel(String cancel) {
		this.cancel =cancel;
	}
	
	public void setSubmit(String submit) {
		this.submit = submit;

	}
	
	public String getResult() {
		return result;
	}
	
	private String click;
	private String cancel;
	private String submit;
	private String result;
	
	public String execute() throws Exception {
		if(click != null) {
			result ="click";
		} else if(cancel != null) {
			result = "cancel";
		} else if (submit != null) {
			result = "submit";
		}
		
		return SUCCESS;
	}

}
