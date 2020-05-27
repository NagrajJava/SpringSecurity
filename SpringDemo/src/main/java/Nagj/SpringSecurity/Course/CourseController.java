package Nagj.SpringSecurity.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Nagj.SpringSecurity.Topics;



@RestController
public class CourseController 
{

    @Autowired
   private CourseService courseService; 
    
   @RequestMapping("/Topics/{topicId}/course")
  public List<Course> getCourse(@PathVariable String topicId)
  {    	   
   	return courseService.getAllTopics(topicId);
  }
   
   
     @RequestMapping("/Topics/{topicId}/course/{id}")
      public Course getcourseById(@PathVariable String id)
      {    	   
	    	return courseService.getTopicById(id);
      }
     
     

     @RequestMapping(method = RequestMethod.POST,value="/Topics/{topicId}/course")
      public void AddCourse(@RequestBody Course course,@PathVariable String topicId)
      {    	   
    	 course.setTopics(new Topics(topicId,"",""));
    	 courseService.addCourse(course);
      }
     
     
     @RequestMapping(method = RequestMethod.PUT,value="/Topics/{topicId}/course/{id}")
      public void UpdateCourseById(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id)
      {    	   
    	 course.setTopics(new Topics(topicId, "",""));
   	         courseService.updateCourse(course);
      }
     
     @RequestMapping(method = RequestMethod.DELETE,value="/Topics/{topicId}/course/{id}")
      public void DeleteCourseById(@PathVariable String id)
      {    	   
   	        courseService.deleteCourseById(id);
      }
}
