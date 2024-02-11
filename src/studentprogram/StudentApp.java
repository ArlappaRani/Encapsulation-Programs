package studentprogram;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Anuj",23,89.5F);
	    System.out.println(s1.getrollNumber()+" "+s1.getname()
	    +" "+s1.getage()+" "+s1.getpercentage()); 	
	    //creating second object
	    Student s2=new Student(2,"Anu",22,75.6F);
	    System.out.println(s2.getrollNumber()+" "+s2.getname()
	    +" "+s2.getage()+" "+s2.getpercentage()); 	

	}

}
