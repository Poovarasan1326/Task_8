package Task_8;
import java.util.Scanner;

public class Task_8_Q10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		String values = Integer.toString(number);

		System.out.println("Number of digits: " + values.length());

	}
}
