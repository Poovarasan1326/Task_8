package Task_8;
import java.util.Scanner;

public class Task_8_Q_1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);

		System.out.print("Enter the a value :");
		int a1 = a.nextInt();
		System.out.print("Enter the b value :");
		int b2 = b.nextInt();
		System.out.print("Enter the c value :");
		int c3 = c.nextInt();
		System.out.print("Enter the d value :");
		int d4 = d.nextInt();

		System.out.println();

		int resultSet_1 = a1 + b2;
		int resultSet_2 = c3 + d4;

		System.out.println(
				"a value is :" + a1 + "  " + "+" + "  " + "b value is :" + b2 + "  " + "=" + "  " + +resultSet_1);
		System.out.println(
				"c value is :" + c3 + "  " + "+" + "  " + "d value is :" + d4 + "  " + "=" + "  " + +resultSet_2);

		System.out.println();

		if (resultSet_1 >= resultSet_2) {
			System.out.println("sum of a and b greaterthan c and d");
		}

		else {
			System.out.println("sum of a and b lessthan c and d");
		}
	}

}
