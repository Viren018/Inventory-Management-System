package com.psl.ims.service.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.psl.ims.entity.User;
import com.psl.ims.repository.UserRepository;

import com.psl.ims.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

	
	@MockBean
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void TestSaveUser()
	{
		User user=new User();
		user.setEmail("abc@gmail.com");
		user.setPassword("xyz");
		user.setRole("ROLE_ADMIN");
		user.setUsername("abc123");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		assertThat(userService.save(user)).isEqualTo(user);
	}
}
