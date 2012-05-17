import java.util.*;

public class t1496 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			Set<String> team = new HashSet<String>();
			Set<String> spammer = new HashSet<String>();
			int N = input.nextInt();

			while (N > 0) {
				String account = input.next();

				if (team.contains(account)) {
					if (!spammer.contains(account)) {
						System.out.println(account);
						spammer.add(account);
					}
				} else {
					team.add(account);
				}
				
				--N;
			}

		}
	}

}
