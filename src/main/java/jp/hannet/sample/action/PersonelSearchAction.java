package jp.hannet.sample.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import jp.hannet.sample.dao.PersonelDao;
import jp.hannet.sample.model.PersonelMapping;


public class PersonelSearchAction extends ActionSupport {
	private static final long serialVersionUID = 761698363602136320L;

	private List<PersonelMapping> myMappings;
	private Integer delid;
	private Integer s_id;

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public Integer getDelid() {
		return delid;
	}

	public void setDelid(Integer delid) {
		this.delid = delid;
	}

	public List<PersonelMapping> getPersonels() {
		return myMappings;
	}

	public String execute() throws Exception {

		PersonelDao dao = new PersonelDao();
		if (this.delid != null) {
			PersonelMapping delMap = new PersonelMapping();
			delMap.setId(delid);
			// 削除
			dao.delete(delMap);
		}
		// 結果取得
		myMappings = dao.likeById(s_id);
		return SUCCESS;
	}


}
