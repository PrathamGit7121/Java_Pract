package myPack;

public class StudOperation {
	
	public int totalMarks(Student stud) {
		
		
		return stud.marks1 + stud.marks2 + stud.marks3;
	}
	
	public String getGrade(int totalMarks) {
		if(totalMarks >= 240)
			return "A Grade";
		else if(totalMarks >= 150)
			return "B Grade";
		else
			return "Pass Grade";
	}
	
	public int getMarks1(Student stud) {
		return stud.marks1;
	}
}