package myPack;

public class Student {
	int rollNo;
	String nm;
	int marks1, marks2, marks3;
	
	Student(int rollNo, String nm, int marks1, int marks2, int marks3) {
		super();
		this.rollNo = rollNo;
		this.nm = nm;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", nm=" + nm + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}
}