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
<<<<<<< HEAD
=======
	
>>>>>>> b1ea3e9a2e346f3404dfcf1ff7e5c9816da10006

	

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


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", enrollment=]";
	}

}
