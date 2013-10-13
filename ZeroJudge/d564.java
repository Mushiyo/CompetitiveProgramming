import java.util.Scanner;

public class d564 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String lan = input.next();
			if (lan.equals("End")) {
				break;
			}
			int integer = input.nextInt();

			if (lan.equals("C")) {
				System.out.print("\"" + lan + "\"" + " can use printf(\"%d\",n); to show integer like " + integer);
			} else if (lan.equals("C++")) {
				System.out.print("\"" + lan + "\"" + " can use cout<<n; to show integer like " + integer);
			} else if (lan.equals("Java")) {
				System.out.print("\"" + lan + "\"" + " can use System.out.print(n); to show integer like " + integer);
			} else if (lan.equals("Pascal")) {
				System.out.print("\"" + lan + "\"" + " can use Write(n); to show integer like " + integer);
			} else {
				System.out.print("\"" + lan + "\"" + " can use Print n to show integer like " + integer);
			}
			System.out.println(".");
		}
	}

}
