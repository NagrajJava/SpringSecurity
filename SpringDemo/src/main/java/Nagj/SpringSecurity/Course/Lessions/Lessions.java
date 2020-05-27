package Nagj.SpringSecurity.Course.Lessions;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Nagj.SpringSecurity.Course.Course;

@Entity
@Table(name = "Lessions")
public class Lessions 
{
	  @Id
	 private String id;
	 private String name;
     private String Desciption;
     
     @ManyToOne
     private Course course;
     
	
     public Lessions() {
		
	}


	public Lessions(String id, String name, String desciption, String courseId) {
		super();
		this.id = id;
		this.name = name;
		Desciption = desciption;
		this.course = new Course(courseId,"","", "");
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesciption() {
		return Desciption;
	}


	public void setDesciption(String desciption) {
		Desciption = desciption;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

     
	
	
}
