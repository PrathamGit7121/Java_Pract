package myPackMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	int id;
	String qName;
	Map<String,String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void displayInfo()
	{
		System.out.println("Question id : "+id);
		System.out.println("Question name : "+qName);
		
		Set<Entry<String,String>> set = answers.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> entry = itr.next();
			System.out.println("Answer: "+entry.getKey()+"Posted By: "+entry.getValue());
			
		}
	}

}
