package com.psl.ims.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.ims.entity.User;
import com.psl.ims.repository.UserRepository;
import com.psl.ims.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	

//	@Override
//	public User getUserByEmail(String email) {
//		return userRepository.findByEmail(email);
//	}
	
	
}
