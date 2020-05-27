package Nagj.SpringSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepos topicRepos;

	public List<Topics> getAllTopics() {
		List<Topics> topics = new ArrayList<Topics>();
		    topicRepos.findAll()
		    .forEach(topics::add);
		return topics;
	}

	public Topics getTopicById(String id) {
		     Topics topics = topicRepos.findById(id).orElse(null);
		return topics;
	}

	public void saveTopics(Topics topics) {
		topicRepos.save(topics);
	}

	public void updateTopics(Topics topics, String id) {
		
		topicRepos.save(topics);
	}

	public void deleteTopicById(String id) {
		
		topicRepos.deleteById(id);
		
	} 
	
	       
	
	
	
	        //Without DataBase
	/*
	 * List<Topics> topics = new ArrayList<Topics>(Arrays.asList( new
	 * Topics("java","JavaLanguage","superpowerfulllanaguage"), new
	 * Topics("Python","Python","powerfull lanaguage"), new
	 * Topics("Rubby","RubbyLanguage","lrubyonrailsanaguage") ));
	 * 
	 * public List<Topics> getAllTopics() { return topics; }
	 * 
	 * public Topics getTopicById(String id) { Topics tp = topics.stream().filter(t
	 * -> t.getId().equalsIgnoreCase(id)).findFirst().get(); return tp; }
	 * 
	 * public void saveInlist(Topics topics2) { // TODO Auto-generated method stub
	 * topics.add(topics2); }
	 * 
	 * public void updatelist(Topics topics2, String id) { for(int
	 * i=0;i<topics.size();i++) { if(topics.get(i).equals(id)) { topics.set(i,
	 * topics2); } }
	 * 
	 * }
	 * 
	 * public void deleteTopicById(String id) { topics.stream().filter(tp ->
	 * tp.getId().equalsIgnoreCase(id)).findFirst().map( tp1 -> topics.remove(tp1));
	 * 
	 * }
	 */
}
