package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserService {

	List<User> list=List.of(
			new User(1200L,"Jhon","876548396"),
			new User(1201L,"Stive","897546548"),
			new User(1202L,"Smith","9898587868"));

	public User getUser(Long id) {
		return this.list.stream()
				.filter(user->user.getUserId().equals(id))
				.findAny()
				.orElse(null);
	}
}
