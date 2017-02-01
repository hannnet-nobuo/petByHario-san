package jp.hannet.sample.action;

import javax.servlet.ServletContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.model.DataList;

public class MessageBordAction extends ActionSupport implements ServletContextAware {

	private static final long serialVersionUID = -6928196015143542873L;
	
	private DataList bordData;
	private String title;
	private String msg;
	private ServletContext context;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title  = title;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public DataList getBordData() {
		return bordData;
	}
	
	public void setBordData(DataList dataList) {
		this.bordData = dataList;
	}
	
	public String execute() throws Exception {
		bordData = (DataList) context.getAttribute("bordData");
		if (bordData == null) {
			bordData = new DataList();
		} else {
			bordData.add(title, msg);
		}
		title = "";
		msg = "";
		return SUCCESS;
	}
	
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;

	}

}
