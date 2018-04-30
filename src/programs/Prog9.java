package programs;
import java.util.Scanner;

public class Prog9{

	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		float r,h,vol;
		System.out.println("Enter radius");
		r=s.nextFloat();
		System.out.println("Enter Height");
		h=s.nextFloat();
			
		if(r!=5 && h>=4) {
			
			vol=(float) ((3.14*r*r*h)/3);
			
			System.out.println("Volume of cone is:  "+vol);
		}
		else
			System.out.println("Invalid inputs...!!");
	}
}
