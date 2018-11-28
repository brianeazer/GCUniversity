package co.groupproject.GCUniversity.model;

import javax.persistence.Entity;

@Entity
public class Admin extends User {
	
	Admin(Long id, String firstName, String lastName, String userName, String password){
		super();
	}
	Admin(){
		
	}
	@Override
	boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}
}
