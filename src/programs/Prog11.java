package programs;

import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		int a[]= new int[10];
		
		int avg=0,tot=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
			
			tot=tot+a[i];
			avg=tot/5;
		}
		System.out.println("Average: "+avg);
			
		
		
	}
}
