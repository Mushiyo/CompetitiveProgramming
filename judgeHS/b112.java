import java.util.Scanner;

public class b112 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] people = new int[N];

			for (int i = 0; i < people.length; ++i) {
				people[i] = input.nextInt();
			}
			
			int maxTeamNum = people[0];
			for (int i = 0; i < people.length; ++i) {
				maxTeamNum = gcd(maxTeamNum, people[i]);
			}
			
			System.out.println(maxTeamNum);
		}
	}

	public static int gcd(int a, int b) {
		while (Math.min(a, b) != 0) {
			if (a >= b) {
				int r = a % b;
				a = b;
				b = r;
			}
			else {
				int r = b % a;
				b = a;
				a = r;
			}
		}
		
		return Math.max(a, b);
	}

}
