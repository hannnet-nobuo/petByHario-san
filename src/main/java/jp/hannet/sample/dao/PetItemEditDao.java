package jp.hannet.sample.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemEditDao {
	
public PetItemMapping selectById(Integer id) {
		
		PetItemMapping map = null;
		if (id != null) {
			Session session = DbAccess.getSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PetItemMapping> cr = builder.createQuery(PetItemMapping.class);
			
			Root<PetItemMapping> root = cr.from( PetItemMapping.class );
			cr.select(root)
			.where(
					builder.equal(root.get("ItemCd"), id)
					);
			
			// 結果取得
			map = (PetItemMapping) session.createQuery(cr)
					.getSingleResult();
		}
		return map;
	}
	
	public void delete(PetItemMapping map) {
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
	
	public void update(PetItemMapping map) {
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
