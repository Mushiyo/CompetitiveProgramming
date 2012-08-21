import java.util.Scanner;

public class u694 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int L = input.nextInt();
		int caseNum = 1;

		while (A > 0 && L > 0) {

			System.out.println("Case " + caseNum + ": A = " + A + ", limit = "
					+ L + ", number of terms = " + countTerm(A, L));

			++caseNum;
			A = input.nextInt();
			L = input.nextInt();
		}
	}

	public static int countTerm(int A, int L) {
		int numOfTerms = 0;
		long aTerm = A;

		while (aTerm <= L) {
			++numOfTerms;

			if (aTerm == 1) {
				break;
			}

			if (aTerm % 2 != 1) {
				aTerm /= 2;
			} else {
				aTerm = 3 * aTerm + 1;
			}
		}

		return numOfTerms;
	}

}
