package Nagj.SpringSecurity.Course.Lessions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Nagj.SpringSecurity.Topics;
import Nagj.SpringSecurity.Course.Course;



@RestController
public class LessionController 
{

    @Autowired
   private LessionService lessionService; 
    
   @RequestMapping("/Topics/{topicId}/course/{courseId}/lession")
  public List<Lessions> getLession(@PathVariable String courseId)
  {    	   
   	return lessionService.getAllLessions(courseId);
  }
   
   
     @RequestMapping("/Topics/{topicId}/course/{courseid}/lession/{id}")
      public Lessions getLessionById(@PathVariable String id)
      {    	   
	    	return lessionService.getLessionById(id);
      }
     
     

     @RequestMapping(method = RequestMethod.POST,value="/Topics/{topicId}/course/{courseId}/lession")
      public void AddLession(@RequestBody Lessions lession,@PathVariable String topicId,@PathVariable String courseId)
      {    	   
    	 lession.setCourse(new Course(courseId,"","",""));
    	 lessionService.addLession(lession);
      }
     
     
     @RequestMapping(method = RequestMethod.PUT,value="/Topics/{topicId}/course/{courseid}/lession/{id}")
      public void UpdateLessionById(@RequestBody Lessions lession,@PathVariable String courseid,@PathVariable String id)
      {    	   
    	 lession.setCourse(new Course(courseid, "","",""));
    	 lessionService.updateLession(lession);
      }
     
     @RequestMapping(method = RequestMethod.DELETE,value="/Topics/{topicId}/course/{courseid}/lession/{id}")
      public void DeleteLessionById(@PathVariable String id)
      {    	   
    	 lessionService.getLessionById(id);
      }
}