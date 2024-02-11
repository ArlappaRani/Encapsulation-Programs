package studentprogram;

public class Student {
	//private data members
	private int rollNumber;
	private String name;
	private int age;
	private float percentage;

	//using constructor for set the values for private data members
	public Student(int rollNumber,String name,int age,float percentage)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	//using public getters for controlled access
	public int getrollNumber()
	{
		return rollNumber;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public float getpercentage()
	{
		return percentage;
	}

}
