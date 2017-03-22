package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemAdminDao {
	
	public List<PetItemMapping> likeById(String id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PetItemMapping> cr = builder.createQuery(PetItemMapping.class);
		Root<PetItemMapping> root = cr.from( PetItemMapping.class );
		cr.select(root);
		
		if (id != null ) {
			cr.where(
				builder.like(root.<String>get("itemCd"), "%" + id + "%")
				);
		}
		
		// 結果取得
		return session.createQuery(cr)
						.getResultList();
	}

}
