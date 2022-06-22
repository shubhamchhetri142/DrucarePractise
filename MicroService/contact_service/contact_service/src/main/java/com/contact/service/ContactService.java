package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactService {

	List<Contact> list=List.of(
			new Contact(1L,"jhon@yahoo.com","jhon",1200L),
			new Contact(2L,"Stive@gmail.com","Stive",1201L),
			new Contact(3L,"Smith@gmail.com","Smith",1202L));

	public List<Contact> getContactOfUser(Long userId){
		return list.stream().filter(contact->contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}
}
