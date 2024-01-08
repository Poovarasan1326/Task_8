package Task_8;
import java.util.Scanner;

public class Task_8_Q_2 {

	public static void main(String args[]) {

		Scanner a = new Scanner(System.in);

		System.out.print("Enter the value :");

		int a1 = a.nextInt();

		int result = a1 % 2;

		if (result == 0) {
			System.out.println("Given number " + a1 + " is even");

		} else {
			System.out.println("Given number " + a1 + " is odd");
		}

	}

}
