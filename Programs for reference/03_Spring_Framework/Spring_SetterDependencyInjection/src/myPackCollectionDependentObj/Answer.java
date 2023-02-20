package myPackCollectionDependentObj;

public class Answer {
	int id;
	String aName;
	String by;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	
	//@Override
	public String toString()
	{
		return id+" "+ aName +" "+by;
	}

}
