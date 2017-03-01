package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetUserMapping;

public class PetUserAdminDao {
	
public List<PetUserMapping> likeById(Integer id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PetUserMapping> cr = builder.createQuery(PetUserMapping.class);
		Root<PetUserMapping> root = cr.from( PetUserMapping.class );
		cr.select(root);
		
		if (id != null ) {
			cr.where(
				builder.like(root.<String>get("userId"), "%" + id + "%")
				);
		}
		
		// 結果取得
		return session.createQuery(cr)
						.getResultList();
	}
}
