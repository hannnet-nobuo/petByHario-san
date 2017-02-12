package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerEditDao {

	public void delete(PetCustomerMapping map) {
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
	
	public void update(PetCustomerMapping map) {
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
	
	public PetCustomerMapping selectById(Integer id) {
		
		PetCustomerMapping map = null;
		if (id != null) {
			Session session = DbAccess.getSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PetCustomerMapping> cr = builder.createQuery(PetCustomerMapping.class);
			
			Root<PetCustomerMapping> root = cr.from( PetCustomerMapping.class );
			cr.select(root)
			.where(
					builder.equal(root.get("id"), id)
					);
			
			// 結果取得
			map = (PetCustomerMapping) session.createQuery(cr)
					.getSingleResult();
		}
		return map;
	}
}
