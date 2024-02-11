package bankcustomerusingprivate;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println("Enter withdrawl amount");
		int amount=scan.nextInt();
		Bank b=new Bank();
		//b.totalAmount=b.totalAmount-amount;//will get error because it is private it 
		//can not accessable by outside class and no one can not access
		if(name.equals("Hero"));
		{
			//System.out.println("The balance is:"+b.totalAmount);//error
		}

	}

}
