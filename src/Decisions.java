import java.util.Scanner;

public class Decisions {
	public static void main(String[] args) {
		System.out.println("Enter your test grade.");
		Scanner in = new Scanner(System.in);
		double grade = in.nextDouble();
		if (grade > 100 || grade < 0) {
			System.out.println("You didn't type a real grade!");
		}
		else if (grade >= 90 && grade <= 100) {
			System.out.println('A');
		}
		else if (grade >= 80 && grade < 90) {
			System.out.println('B');
		}
		else if (grade >= 70 && grade < 80) {
			System.out.println('C');
		}
		else if (grade >= 60 && grade < 70) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
		in.close();
	}
}