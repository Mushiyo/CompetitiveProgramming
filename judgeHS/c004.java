import java.util.Scanner;

public class c004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		while (n > 0) {
			--n;

			int sum = input.nextInt();
			int diff = input.nextInt();

			if ((sum + diff) % 2 != 0) {
				System.out.println("impossible");
				continue;
			}

			int teamWin = (sum + diff) / 2;
			int teamLose = (sum - diff) / 2;

			if (teamWin >= 0 && teamLose >= 0) {
				System.out.println(teamWin + " " + teamLose);
			}
			else {
				System.out.println("impossible");
			}
		}
	}

}
