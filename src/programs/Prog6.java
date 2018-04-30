package programs;
import java.util.Scanner;

public class Prog6{

	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a =s.nextInt();
		
		System.out.println("Enter Second number");
		int b =s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("value of A:   "+a);
		System.out.println("Value of B:  "+b);
	}
}
