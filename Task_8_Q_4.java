package Task_8;
import java.util.Scanner;

public class Task_8_Q_4 {

	public static void main(String args[]) {

		Scanner a = new Scanner(System.in);

		System.out.print("Enter number1 : ");
		int num1 = a.nextInt();
		System.out.print("Enter number2 : ");
		int num2 = a.nextInt();

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num2 : " + num2);
		System.out.println("num1 : " + num1);

	}

}
