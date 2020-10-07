package com.project.ifaces;

public interface UserDAO<T> extends DAO<T> {
	
	boolean loginMethod(String email,String Password); //Change Name
	
}
