package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetSellMapping;

public class PetSellAdminDao {
	
public List<PetSellMapping> likeById(Integer id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PetSellMapping> cr = builder.createQuery(PetSellMapping.class);
		Root<PetSellMapping> root = cr.from( PetSellMapping.class );
		cr.select(root);
		
		if (id != null ) {
			cr.where(
				builder.like(root.<String>get("sellNo"), "%" + id + "%")
				);
		}
		
		// 結果取得
		return session.createQuery(cr)
						.getResultList();
	}

}
