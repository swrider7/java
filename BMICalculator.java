import java.util.Scanner;

public class BMICalculator {
	public static void main ( String[] args ) {
		Scanner tablero = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print("Your heigt in m: ");
		m = tablero.nextDouble();
		
		System.out.print("Your wieght in kg: ");
		kg = tablero.nextDouble();
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi);
	}
}