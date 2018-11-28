package co.groupproject.GCUniversity.model;

import javax.persistence.Entity;

@Entity
public class Student extends User {

	Student(Long id, String firstName, String lastName, String userName, String password){
		super();
	}
	Student(){
		
	}
	@Override
	boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
