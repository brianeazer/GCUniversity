package co.groupproject.GCUniversity.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Admin;
import co.groupproject.GCUniversity.model.User;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	public User findByLastname(String lastname) {
		try {
			return em.createQuery("FROM User" + " WHERE lastname = :lastname", User.class)
					.setParameter("lastname", lastname).getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}

	}
	
	

}
