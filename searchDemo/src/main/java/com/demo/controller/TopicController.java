package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTheTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {//pick instance from req body 
		topicService.addTopic(topic);   // calling service method for business logic 
	}
	//localhost:8080/search?query=food
	@GetMapping("/search")
	public ResponseEntity<List<Topic>> searchProducts(
			@RequestParam("query") String query){
		System.out.println("---------------");
		return ResponseEntity.ok(topicService.searchProducts(query));
	}
	
	//localhost:8080/topics/page?pageNo=1&sort=name
	@GetMapping("/topics/page")
	public  Page<Topic>  getTopicsByPage(
			@RequestParam("pageNo") Optional<Integer> pageParam,
			@RequestParam("sort") Optional<String>  sortBy){
		return topicService.getProductsByPage(pageParam,sortBy);
	}
}
