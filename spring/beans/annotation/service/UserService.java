package spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.beans.annotation.repository.UserRepositoryImpl;

@Service
public class UserService {
	
	private UserRepositoryImpl uri;
	
	@Autowired
	public void setUri(UserRepositoryImpl uri) {
		this.uri = uri;
	}
	
	public void add() {
		System.out.println("UserService add...");
		uri.save();
	}
}
