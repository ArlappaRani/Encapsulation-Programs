package bankcustomerprogram;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println("Enter the withdrawl amount");
		int amount=scan.nextInt();
		Bank b=new Bank();
		b.totalAmount=b.totalAmount-amount;
		if(name.equals("Hero"))
		{
			System.out.println("The entered amount is:"+amount);
			System.out.println("The remainming balance is:"+b.totalAmount);
		}

	}

}
