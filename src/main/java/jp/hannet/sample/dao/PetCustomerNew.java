package jp.hannet.sample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerNew {

	public void save(PetCustomerMapping map) {
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
}
