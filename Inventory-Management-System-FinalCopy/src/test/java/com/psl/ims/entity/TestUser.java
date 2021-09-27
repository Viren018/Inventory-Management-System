package com.psl.ims.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.psl.ims.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestUser {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void TestSaveUser()
	{
		User user=new User();
		user.setEmail("abc@gmail.com");
		user.setPassword("xyz");
		user.setRole("ROLE_ADMIN");
		user.setUsername("abc123");
		User savedUser=userRepository.save(user);
		assertNotNull(savedUser);
		
	}
	
	@Test
	public void TestGetUserByUsername()
	{
		String username="aa145";
		User user=userRepository.getUserByUserName(username);
		assertThat(user.getUsername()).isNotEqualTo(null);
	}
	@Test
	public void TestGetUserByUsernameDoesnotExist()
	{
		String username="userdoesnotexist";
		User user=userRepository.getUserByUserName(username);
		assertNull(user);
	}
	
	
}
