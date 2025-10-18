package springaz.service;

import java.util.List;

import springaz.entity.UserEntity;

public interface UserServiceImple {
	
	
	 List<UserEntity> getAllUsers();


	    UserEntity getUsersById(Long id);

	    UserEntity createUser(UserEntity user);

	    UserEntity updateUser(Long id ,UserEntity user);

	    void  deleteUser(Long id);


}
