import java.util.Scanner;

public class Timus1493 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int ticketNum = input.nextInt();
			int previousNum = ticketNum - 1;
			int nextNum = ticketNum + 1;

			if (isLuckyTicket(previousNum) || isLuckyTicket(nextNum)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

	public static boolean isLuckyTicket(int ticketNum) {
		String stringTicketNum = Integer.toString(ticketNum);
		//不足6位數補0
		while(stringTicketNum.length() < 6){
			stringTicketNum = "0" + stringTicketNum;
		}
		
		String firstHalf = stringTicketNum.substring(0, 3);
		String secondHalf = stringTicketNum.substring(3);

		int sumOfFirst = 0;

		for (int i = 0; i < firstHalf.length(); ++i) {
			sumOfFirst += firstHalf.charAt(i) - '0';
		}

		int sumOfSecond = 0;

		for (int i = 0; i < secondHalf.length(); ++i) {
			sumOfSecond += secondHalf.charAt(i) - '0';
		}

		if (sumOfFirst != sumOfSecond) {
			return false;
		}
		else {
			return true;
		}
	}

}
