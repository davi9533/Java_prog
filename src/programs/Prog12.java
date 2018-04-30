package programs;
import java.util.Scanner;

public class Prog12{

	public static void main(String[] args) {
		
		int t,a,b,x,y,lcm,hcf;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number");
		a =s.nextInt();
		
		System.out.println("Enter Second number");
		b =s.nextInt();
		
		x=a;
		y=b;
		while(y!=0) {
			t=y;
			y=x%y;
			x=t;
		}
		hcf=a;
		lcm=(a*b)/hcf;
		b=a-b;
		a=a-b;
		
		
		System.out.println("HCF: "+hcf);
		System.out.println("LCM: "+lcm);
	}
}
