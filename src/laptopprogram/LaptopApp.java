package laptopprogram;

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating laptop object
		Laptop lp1=new Laptop("Inteli5","4gb ram");
		//getting values using getter method
		System.out.println(lp1.getProcessorName()+" "+lp1.getmemorysize());
		Laptop lp2=new Laptop("Corei3","2gb ram");
		//getting values using getter method
		System.out.println(lp2.getProcessorName()+" "+lp2.getmemorysize());
	
				
		

	}

}
