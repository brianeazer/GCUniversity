package co.groupproject.GCUniversity.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.groupproject.GCUniversity.model.Admin;
import co.groupproject.GCUniversity.model.Course;
import co.groupproject.GCUniversity.model.Enrollment;

@Repository
@Transactional
public class CourseDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Course> findAllCourses() {
		// This query returns a list of Strings, so I give it String.class
		List<Course> courseList = em.createQuery("FROM Course", Course.class)
				.getResultList();
		// Convert the List to a Set.
		return new ArrayList<>(courseList);
	}
	public List<Enrollment> getId(Course id) {
		return em.createQuery("FROM Enrollment" + " WHERE course = :course", Enrollment.class)
				.setParameter("course", id).getResultList();
		
	}
}
