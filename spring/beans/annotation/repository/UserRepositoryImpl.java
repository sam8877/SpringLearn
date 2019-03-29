package spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public void save() {
		System.out.println("UserRepositoryImpl save...");
	}

}
