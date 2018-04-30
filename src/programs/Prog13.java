package programs;
import java.util.Scanner;

public class Prog13{

	public static void main(String[] args) {
		
		int a,i,fact = 1;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		a =s.nextInt();
		
		for(i=1;i<=a;++i) {
			
			fact= fact*i;
			
			
		}
		System.out.println("Factorial: "+fact);
		
		
		
	}
}
