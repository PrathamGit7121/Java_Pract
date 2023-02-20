package myPackInheritance2;

class Student {
	int rollno;
	String name;
	
	public Student() {
	}
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}
public class Marks extends Student
{
	int m1;
	int m2;
	public Marks() {
	}
	public Marks(int r, String nm, int m1, int m2) {
		super(r,nm);
		this.m1 = m1;
		this.m2 = m2;
	}
	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + "]";
	}
	public void result()
	{
		float percentage=((m1+m2)/200)*100;
		System.out.println("Percentage= "+percentage);
	}
}
