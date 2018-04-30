package programs;
import java.util.Scanner;

public class Prog5{

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1: ");
		a=s.nextInt();
		System.out.println("Enter number2: ");
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		
		System.out.println("Number1:  "+a);
		System.out.println("Number2:  "+b);

	}
}
