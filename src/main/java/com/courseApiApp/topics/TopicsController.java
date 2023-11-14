package com.courseApiApp.topics;
	



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Optional<Topics> getTopic(@PathVariable Integer id) {
		return topicService.getTopic(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topics topic, @PathVariable Integer id) {

		topicService.updateTopics(id, topic);

	}
	
	
	

	/*
	 * @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}") public
	 * void deleteTopic(@PathVariable Integer id) {
	 * 
	 * topicService.deleteTopic(id);
	 * 
	 * }
	 */

}
