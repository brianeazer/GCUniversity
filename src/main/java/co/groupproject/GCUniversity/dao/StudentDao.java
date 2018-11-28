package co.groupproject.GCUniversity.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Student;

;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	private EntityManager em;

	public Student findByLastname(String lastname) {
		try {
			return em.createQuery("FROM Student" + " WHERE lastname = :lastname", Student.class)
					.setParameter("lastname", lastname).getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}

	}

}
