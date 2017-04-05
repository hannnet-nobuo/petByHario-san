package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetReserveMapping;


public class PetReserveAdminDao {
	
public List<PetReserveMapping> likeById(Integer id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PetReserveMapping> cr = builder.createQuery(PetReserveMapping.class);
		Root<PetReserveMapping> root = cr.from( PetReserveMapping.class );
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
