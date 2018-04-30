package programs;
import java.util.Scanner;

public class Prog7{

	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a =s.nextInt();
		
		if(a%3==0 && a%5==0)
			
			System.out.println("Divisible by 3 and 5 both");
		else
			System.out.println("Not divisible by 3 and 5 both");
	}
}
