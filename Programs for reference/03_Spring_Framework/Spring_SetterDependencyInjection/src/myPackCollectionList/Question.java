package myPackCollectionList;

import java.util.Iterator;
import java.util.List;


public class Question {
	int id;
	String qName;
	List<String> answers;
	
	
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

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public void displayInfo()
	{
		System.out.println(id+" "+qName);
		System.out.println("Answers are : ");
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

}
