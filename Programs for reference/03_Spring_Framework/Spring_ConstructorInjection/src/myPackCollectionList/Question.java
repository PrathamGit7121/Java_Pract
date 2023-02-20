package myPackCollectionList;

import java.util.List;

public class Question {
	int id;  
	String name;  
	List<String> answers;
	
	
	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}


	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}  
	
	

}
