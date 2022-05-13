package com.snehal.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topic")
public String topics()
{
	return "topic completed";
	
}
	@RequestMapping("/topiclist")
public List<Topic> topiclist()
{
	
	return Arrays.asList(
			new Topic("1S","Snehal","pune"),
			new Topic("2A","sayali","Mumbai")
		);
	
}
}
