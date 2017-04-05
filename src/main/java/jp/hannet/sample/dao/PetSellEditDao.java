package jp.hannet.sample.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetSellMapping;

public class PetSellEditDao {
	
public PetSellMapping selectById(Integer id) {
		
		PetSellMapping map = null;
		if (id != null) {
			Session session = DbAccess.getSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PetSellMapping> cr = builder.createQuery(PetSellMapping.class);
			
			Root<PetSellMapping> root = cr.from( PetSellMapping.class );
			cr.select(root)
			.where(
					builder.equal(root.get("sellNo"), id)
					);
			
			// 結果取得
			map = (PetSellMapping) session.createQuery(cr)
					.getSingleResult();
		}
		return map;
	}
	
	public void delete(PetSellMapping map) {
		Transaction txn = null;
		Session session = null;
		try {
			session = DbAccess.getSession();
			txn = session.getTransaction();
			txn.begin();
			session.delete(map);
			txn.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(PetSellMapping map) {
		Transaction txn = null;
		Session session = null;
		try {
			session = DbAccess.getSession();
			txn = session.getTransaction();
			txn.begin();
			session.update(map);
			txn.commit();
		} finally {
			session.close();
		}
	}


}
