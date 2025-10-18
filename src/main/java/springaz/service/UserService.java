package springaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import springaz.entity.UserEntity;
import springaz.repository.UserRepository;

@Service
public class UserService  implements UserServiceImple {
	
	@Autowired
	 private UserRepository userRepository;


	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity getUsersById(Long id) {
		 return userRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not found with id:"+ id));
	}

	@Override
	public UserEntity createUser(UserEntity user) {
		 return userRepository.save(user);
	}

	@Override
	public UserEntity updateUser(Long id, UserEntity user) {
		var existingUser = getUsersById(id);
		 existingUser.setName(user.getName());
		 existingUser.setPassword(user.getPassword());
		 existingUser.setProfession(user.getProfession());
		 existingUser.setSocial_links(user.getSocial_links());
		 existingUser.setExperience(user.getExperience());
		 return userRepository.save(existingUser);

	
	}

	@Override
	public void deleteUser(Long id) {
		 if (!userRepository.existsById(id)){
	         throw new RuntimeException("User not found with id:"+ id);
	     }
	     userRepository.deleteById(id);
	    }
		
	}


