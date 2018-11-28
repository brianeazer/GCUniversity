package co.groupproject.GCUniversity.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Admin;

@Repository
@Transactional
public class AdminDao {

	@PersistenceContext
	private EntityManager em;

	public Admin findByLastname(String lastname) {
		try {
			return em.createQuery("FROM Admin" + " WHERE lastname = :lastname", Admin.class)
					.setParameter("lastname", lastname).getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}

	}
}
