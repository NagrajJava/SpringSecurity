package Nagj.SpringSecurity.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Nagj.SpringSecurity.Topics;

@Entity
@Table(name = "Course")
public class Course 
{
	   @Id
	 private String id;
	 private String name;
     private String Desc;
     
     @ManyToOne
     private Topics topics;
     
    
	
     public Course() {
		
	}

     
	public Course(String id, String name, String desc, String topicId) {
		super();
		this.id = id;
		this.name = name;
		Desc = desc;
		this.topics = new Topics(topicId, "","");
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

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public Topics getTopics() {
		return topics;
	}

	public void setTopics(Topics topics) {
		this.topics = topics;
	}



	
	
}
