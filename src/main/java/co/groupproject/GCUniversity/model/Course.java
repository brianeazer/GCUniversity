package co.groupproject.GCUniversity.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import antlr.collections.List;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Enrollment> getEnrollments() {
		return enrollments;
	}



	public void setEnrollments(ArrayList<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", enrollment=]";
	}

}
