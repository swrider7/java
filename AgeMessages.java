import java.util.Scanner;

public class AgeMessages {
	public static void main ( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\t too young to create a FB Account" );
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver's license" );
		}
		if (age < 18) {
			System.out.println("\tto young to get a tattoo" );
		}
		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol" );
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S." );
			System.out.println("\t\t(How sad!)" );
		}
		if (age >= 35 && age < 65) {
			System.out.println("\tYou are in the age were you need to work to retire!!" );
		}
		if (age >= 65) {
			System.out.println("\tYou have worked long enough. Now do what you want!!!" );
		}
		
	}
}