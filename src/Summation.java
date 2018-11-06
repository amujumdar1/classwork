import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter the starting value.");
		int startValue = in.nextInt();
		
		System.out.println("Enter the ending value.");
		int endValue = in.nextInt();
		
		System.out.println("What type of loop do you want? 1 for while loop, 2 for a do...while loop, 3 for a for loop.");
		int loopType = in.nextInt();
		
		int sum = 0; 
		
		switch (loopType) {
		case 1:
			while (startValue <= endValue) {
				sum += startValue++;
			}
			System.out.println("The sum is " + sum);
			break;
		case 2:
			do {
				sum += startValue++;
			} while (startValue <= endValue);
			System.out.println("The sum is " + sum);
			break;
		case 3:
			for (int i = startValue; i <= endValue; i++) {
				sum += startValue++; 
			}System.out.println("The sum is " + sum);
			break;
		default:
			System.out.println("You didn't enter a valid number!");
		}
		
		in.close(); 
	}
}