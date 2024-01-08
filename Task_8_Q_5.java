package Task_8;
import java.util.Scanner;

public class Task_8_Q_5 {

	public static void main(String args[]) {

		Scanner a = new Scanner(System.in);
		System.out.print("Enter number : ");

		int givenNumber = a.nextInt();
		boolean isPrime = true;

		boolean t = true;
		int i = 2;
		while (i <= givenNumber) {
			if (givenNumber % 2 == 0) {
				System.out.println("Not a prime Number :" + givenNumber);
				t = false;
				break;

			}
			i++;
			if (t) {

				System.out.println("prime Number :" + givenNumber);
				break;

			}

		}

	}
}
