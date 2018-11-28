package co.groupproject.GCUniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Course;
import co.groupproject.GCUniversity.model.Enrollment;
import co.groupproject.GCUniversity.model.Student;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	private EntityManager em;

	// Find by last name for login & to determine whether Admin or not.
	public Student findByLastname(String lastname) {
		try {
			return em.createQuery("FROM Student" + " WHERE lastname = :lastname", Student.class)
					.setParameter("lastname", lastname).getSingleResult();
		} catch (NoResultException ex) {
			// No user with that last name found will return null.
			return null;
		}

	}

	// List Students
	public List<Student> findAll() {
		return em.createQuery("FROM Student", Student.class).getResultList();
	}

	// List Courses
	public List<Enrollment> findByCourse(Course course) {
		return em.createQuery("FROM Enrollment WHERE course = :course", Enrollment.class).setParameter("course", course)
				.getResultList();
	}

	// List Grades
	public List<Enrollment> findByGrade(String grade) {
		return em.createQuery("FROM Enrollment WHERE grade = :grade", Enrollment.class).setParameter("grade", grade)
				.getResultList();
	}

	// List Semesters
	public List<Enrollment> findBySemester(String semester) {
		return em.createQuery("FROM Enrollment WHERE semester = :semester", Enrollment.class)
				.setParameter("semester", semester).getResultList();
	}

}
