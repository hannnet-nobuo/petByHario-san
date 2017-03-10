package jp.hannet.sample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetItemMapping;

public class PetItemNewDao {
	
	public void save(PetItemMapping map) {
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
