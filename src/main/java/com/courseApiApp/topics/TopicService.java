package com.courseApiApp.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	TopicsRepository topicsRepository;
	

	// List<Topics> topics = new ArrayList<>((Arrays.asList(new Topics(1, "spring",
	// "Spring framework"),
	// new Topics(2, "Spring", "Spring Boot"), new Topics(3, "spring", "Spring
	// web"))));

	public List<Topics> getAllTopics() {

		List<Topics> topics = new ArrayList<>();
		topicsRepository.findAll().forEach(topics::add);

		return topics;
	}

	public Optional<Topics> getTopic(Integer id) {

		return topicsRepository.findById(id);
	}

	public void addTopic(Topics topic) {

		topicsRepository.save(topic);
	}

//	public Optional<Topics> updateTopic(Integer id, Topics topic) {
//
//		Optional<Topics> updatedTopic =topicsRepository.findById(id);
//		updatedTopic.setName(topic.getName());
//		updatedTopic.setDescription(topic.getDescription());
//        topicsRepository.save(updatedTopic);
//          return updatedTopic;
//	}/
	
	public void updateTopics(Integer id, Topics topics) {
		//Topics topics2 = new Topics();
		Topics updatedTopics= topicsRepository.findById(id).get();
		updatedTopics.setName(topics.getName());
		updatedTopics.setDescription(topics.getDescription());
		topicsRepository.save(updatedTopics);
	}

	public void deleteTopic(Integer id) {

		topicsRepository.deleteById(id);

	}

	public void updateDesc(Integer id, Topics topic) {
		// TODO Auto-generated method stub
		
	}

}
