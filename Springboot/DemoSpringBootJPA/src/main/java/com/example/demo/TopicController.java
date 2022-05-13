package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	@RequestMapping("/topic")
	public String topics(){
		return "topic completed";
	}
	@RequestMapping("/topiclist")
	public List<Topic> topiclist(){
		return topicservice.getalltopics();
	}
	@RequestMapping("/topicbyid/{id}")
	 public Optional<Topic> topicbyid(@PathVariable String id) { return
	      topicservice.gettopic(id);
	  }
	 @RequestMapping(method=RequestMethod.POST,value="/topiclist")
	public void addtopic(@RequestBody Topic topic){
		topicservice.addtopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topicbyidupdate/{id}")
	public void updatetopic(@RequestBody Topic topic,@PathVariable String id){
		topicservice.updatetopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topicbyiddelete/{id}")
	public void deletetopic(@PathVariable String id){
		topicservice.deletetopic(id);
	}
}
