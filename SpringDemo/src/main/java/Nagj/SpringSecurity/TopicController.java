package Nagj.SpringSecurity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	     @Autowired
	    private TopicService demoService; 
	     
	    @RequestMapping("/Topics")
       public List<Topics> getTopics()
       {    	   
	    	return demoService.getAllTopics();
       }
	    
	    
	      @RequestMapping("/Topics/{id}")
	       public Topics getTopicsById(@PathVariable String id)
	       {    	   
		    	return demoService.getTopicById(id);
	       }
	      
	      

	      @RequestMapping(method = RequestMethod.POST,value="/Topics")
	       public void getTopicsById(@RequestBody Topics topics)
	       {    	   
	    	  demoService.saveTopics(topics);
	       }
	      
	      
	      @RequestMapping(method = RequestMethod.PUT,value="/Topics/{id}")
	       public void UpdateTopicsById(@RequestBody Topics topics,String id)
	       {    	   
	    	  demoService.updateTopics(topics,id);
	       }
	      
	      @RequestMapping(method = RequestMethod.DELETE,value="/Topics/{id}")
	       public void DeleteTopicsById(@PathVariable String id)
	       {    	   
	    	  demoService.deleteTopicById(id);
	       }
}
