package programs;
import java.util.Scanner;

public class Prog8{

	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a =s.nextInt();
		
		if(a%3==0 || a%5==0 || a%9==0)
			
			System.out.println("Divisible...!!");
		else
			System.out.println("Not divisible...!!");
	}
}
