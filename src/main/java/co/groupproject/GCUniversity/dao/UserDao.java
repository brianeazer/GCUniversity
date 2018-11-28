package co.groupproject.GCUniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Admin;
import co.groupproject.GCUniversity.model.Enrollment;
import co.groupproject.GCUniversity.model.Student;
import co.groupproject.GCUniversity.model.User;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	public User findByLastname(String lastName) {
		try {
			return em.createQuery("FROM User" + " WHERE lastName = :lastName", User.class)
					.setParameter("lastName", lastName).getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}
	
	public List<Enrollment> findByStudent(Student student) {
		return em.createQuery("FROM Enrollment WHERE  student= :student", Enrollment.class).setParameter("student", student)
				.getResultList();
	}
	
	

}
