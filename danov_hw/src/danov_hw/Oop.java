package danov_hw;

import java.util.Scanner;

public class Oop {
	static String status;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		printIntroduction();
		getBMI(scan);
	}

	public static void printIntroduction() {
		System.out.println(
				"Hello!\nTo calculate your BMI, you'll have to input your:\nHeight in centimeters\nWeight in kilograms\nHealth status\n");
	}

	public static double getBMI(Scanner scan) {
		System.out.print("Your weight is:");
		double weight = scan.nextDouble();
		System.out.print("Your height is:");
		double height = scan.nextDouble();
		double weightInPounds = weight * 2.2046;
		double heightInInches = height * 0.3937;
		return bmiFor(weightInPounds, heightInInches);
	}

	public static double bmiFor(double a, double b) {
		double bmi = a * 703 / (b * b);
		//System.out.printf("Your body mass index is : %.2f", bmi);
		getStatus(bmi);
		return bmi;
	}

	public static String getStatus(double bmi) {
		reportResults(bmi, Oop.status);
		if(bmi <= 18.5) {
			Oop.status = "underweight";
			//System.out.println("\nYou are " + status);
		} else if(bmi <= 25) {
			Oop.status = "normal";
			//System.out.println("\nYou are " + status);
		} else if(bmi <= 30) {
			Oop.status = "overweight";
			//System.out.println("\nYou are " + status);
		} else if(bmi > 30) {
			Oop.status = "obese";
			//System.out.println("\nYou are " + status);
		}
		return Oop.status;
	}
	
	public static void reportResults(double bmi, String status) {
		System.out.printf("Your body mass index is : %.2f", bmi);
		System.out.print("\nAnd your health state is : " + status);
	}

}
























