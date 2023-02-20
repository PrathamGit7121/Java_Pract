package myPackCollectionDependentObj;

import java.util.Iterator;
import java.util.List;

public class Question {
	int id;
	String qName;
	List<Answer> answers;
	
	
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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void displayInfo()
	{
		System.out.println(id+" "+qName);
		System.out.println("Answers are : ");
		Iterator<Answer> itr = answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

}
