package programs;
import java.util.Scanner;

public class Prog4{

	public static void main(String[] args) {
		
		String word;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		
		word = s.next();
		switch(word) {
		
		case "a":
			System.out.println("It is a vowel");
			break;
		case "e":
			System.out.println("It is a vowel");
			break;
		case "i":
			System.out.println("It is a vowel");
			break;
		case "o":
			System.out.println("It is a vowel");
			break;
		case "u":
			System.out.println("It is a vowel");
			break;
		
		default:
			System.out.println("It is a consonant");
	
	
		}

	}
}
