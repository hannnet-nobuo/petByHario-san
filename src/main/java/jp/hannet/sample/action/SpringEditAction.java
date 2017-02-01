package jp.hannet.sample.action;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.HttpParametersAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.model.MyMapping;
import jp.hannet.sample.service.IMyMappingService;


public class SpringEditAction extends ActionSupport implements HttpParametersAware {


	private static final long serialVersionUID = -3521141713234828082L;
	private String editid;
	private String id;
	private String name;
	private String memo;
	private String update;
	private HttpParameters param;
	
	private IMyMappingService myMappingService; 
	
	public void setMyMappingService(IMyMappingService myMappingService) {
		this.myMappingService = myMappingService;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getEditid() {
		return editid;
	}

	public void setEditid(String editid) {
		this.editid = editid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String execute() throws Exception {
		
		if (param.contains("editid")) {
			editid = param.get("editid").getValue();
		}
		
		if (editid != null) {
			// 結果取得
			MyMapping map = myMappingService.selectById(editid);
			id = map.getId();
			name = map.getName();
			memo = map.getMemo();
		} else if (update != null && id != null) {
			MyMapping map = new MyMapping();
			map.setId(id);
			map.setName(name);
			map.setMemo(memo);				
			myMappingService.update(map);
		}
			
        return SUCCESS;
    }

	public void setParameters(HttpParameters arg0) {
		param = arg0;
		
	}


}
