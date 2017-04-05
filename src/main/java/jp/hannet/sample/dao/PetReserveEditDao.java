package jp.hannet.sample.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetReserveMapping;

public class PetReserveEditDao {
	
public PetReserveMapping selectById(Integer id) {
		
		PetReserveMapping map = null;
		if (id != null) {
			Session session = DbAccess.getSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PetReserveMapping> cr = builder.createQuery(PetReserveMapping.class);
			
			Root<PetReserveMapping> root = cr.from( PetReserveMapping.class );
			cr.select(root)
			.where(
					builder.equal(root.get("reserveId"), id)
					);
			
			// 結果取得
			map = (PetReserveMapping) session.createQuery(cr)
					.getSingleResult();
		}
		return map;
	}
	
	public void delete(PetReserveMapping map) {
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
	
	public void update(PetReserveMapping map) {
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
