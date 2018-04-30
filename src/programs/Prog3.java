package programs;
import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		
		double sqr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		double num = s.nextFloat();
		sqr=Math.sqrt(num);
		
		System.out.println(sqr);
	
	}
}