package programs;
import java.util.Scanner;

public class Prog17{

	public static void main(String[] args) {
		

		Scanner sa= new Scanner(System.in);
		float s,a,b,c,area;
		System.out.println("Enter First side of triangle: ");
		a=sa.nextFloat();
		System.out.println("Enter Second side of triangle: ");
		b=sa.nextFloat();
		System.out.println("Enter Third side of triangle: ");
		c=sa.nextFloat();
		
		s=(a+b+c)/2;
		area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area:  "+area);
	}
}

