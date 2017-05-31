package jp.hannet.sample.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetCustomerMapping;

public class PetCustomerAdminDao {

public List<PetCustomerMapping> likeById(Integer id) {
		
		Session session = DbAccess.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<PetCustomerMapping> cr = builder.createQuery(PetCustomerMapping.class);
		Root<PetCustomerMapping> root = cr.from( PetCustomerMapping.class );
		cr.select(root);
		
		if (id != null ) {
			cr.where(
				builder.like(root.<String>get("customerId"), "%" + id + "%")
				);
		}
		
		// 結果取得
		return session.createQuery(cr)
						.getResultList();
	}
}
