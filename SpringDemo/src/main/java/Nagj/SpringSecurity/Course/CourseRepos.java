package Nagj.SpringSecurity.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepos extends CrudRepository<Course, String> 
{
     public  List<Course>  findByTopicsId(String topicsId);
}
