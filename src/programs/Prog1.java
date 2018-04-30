package programs;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		
		float fah,cel;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit:  ");
		fah=s.nextFloat();
		cel =((fah-32)* 5)/9;
		
		System.out.println("Temperature in celcius is:  "+cel);
		}
}
