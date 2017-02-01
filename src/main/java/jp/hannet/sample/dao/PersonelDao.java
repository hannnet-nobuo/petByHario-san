package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PersonelMapping;


public class PersonelDao {
	
	public PersonelMapping selectById(Integer id) {
		
		PersonelMapping map = null;
		if (id != null) {
			Session session = DbAccess.getSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PersonelMapping> cr = builder.createQuery(PersonelMapping.class);
			
			Root<PersonelMapping> root = cr.from( PersonelMapping.class );
			cr.select(root)
			.where(
					builder.equal(root.get("id"), id)
					);
			
			// 結果取得
			map = (PersonelMapping) session.createQuery(cr)
					.getSingleResult();
		}
		return map;
	}
	
	public List<PersonelMapping> likeById(Integer id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PersonelMapping> cr = builder.createQuery(PersonelMapping.class);
		Root<PersonelMapping> root = cr.from( PersonelMapping.class );
		cr.select(root);
		
		if (id != null ) {
			cr.where(
				builder.like(root.<String>get("id"), "%" + id + "%")
				);
		}
		
		// 結果取得
		return session.createQuery(cr)
						.getResultList();
	}
	
	public boolean existById(Integer id) {
		boolean re = false;
		if (id != null) {
			Session session = null;
			try {
				session = DbAccess.getSession();
				
				@SuppressWarnings("unchecked")
				Query<Long> q = session
								.getNamedQuery("existById")
								.setParameter("id", id);
				
				if (q.getSingleResult() > 0) {
					re = true;
				}
			} finally {
				session.close();
			}
		}
		return re;
	}
	
	public void save(PersonelMapping map) {
		Transaction txn = null;
		Session session = null;
		try {
			session = DbAccess.getSession();
			txn = session.getTransaction();
			txn.begin();
			session.save(map);
			txn.commit();
		} finally {
			session.close();
		}
	}

	public void delete(PersonelMapping map) {
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
	
	public void update(PersonelMapping map) {
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
