package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;

import com.demo.entity.Topic;
import com.demo.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public  List<Topic>  getAllTopics(){
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
	}

	public  void  addTopic(Topic topic){
		topicRepository.save(topic);
	}
	public List<Topic> searchProducts(String query) {
		System.out.println(query);
		List<Topic> output = topicRepository.searchTopic(query);
		System.out.println(output);
		return output;
	}
	public Page<Topic> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
		return	topicRepository.findAll(
				PageRequest.of(
						pageParam.orElse(0),  //page number
						3, //3 records per page
				Direction.ASC, //Direction
				sortBy.orElse("id"))); // sort based on column
	}

}

