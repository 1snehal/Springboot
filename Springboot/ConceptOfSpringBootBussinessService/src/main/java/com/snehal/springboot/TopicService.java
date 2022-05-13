package com.snehal.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("1S","Snehal","pune"),
			new Topic("2A","sayali","Mumbai")
		));
	public List<Topic> getalltopics(){
		return topics;
		
	}
	public Topic gettopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		
	}
	public void addtopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updatetopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void deletetopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
		
	}
	
	
}
