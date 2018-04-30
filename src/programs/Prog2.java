package programs;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		
		float rad;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of the Circle:  ");
		rad=s.nextFloat();
		
		if(rad%2==0) {
		
			System.out.println("Area of Circle:  "+(3.14*rad*rad));
		}
		
		else
			System.out.println("Perimeter of Circle:  "+(2*3.14*rad));
	}
}