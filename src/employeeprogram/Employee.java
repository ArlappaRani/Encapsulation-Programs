package employeeprogram;

public class Employee {
	private int id;
	private String name;
	private int salary;
	//using public setter method for private data members
    public void setData(int id,String name,int salary)
    {
    	this.id=id;
    	this.name=name;
        this.salary=salary;
    	}
    
    //using public getter method for private data members
    public int getId()
    {
    	return id;
    }
    public String getname()
    {
    	return name;
    }
    public int getSalary()
    {
    	return salary;
    }

}
