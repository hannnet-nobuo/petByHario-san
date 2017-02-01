package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetUserMapping;

public class PetLoginDao {

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
}
