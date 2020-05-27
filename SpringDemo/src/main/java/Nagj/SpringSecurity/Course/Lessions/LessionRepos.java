package Nagj.SpringSecurity.Course.Lessions;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessionRepos extends CrudRepository<Lessions, String> 
{
     public  List<Lessions>  findByCourseId(String courseId);
}
