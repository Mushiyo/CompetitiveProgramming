import java.util.*;

public class d614 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int T = Integer.parseInt(input.nextLine());
		//如果用nextInt抓，則接下來的nextLine()會抓到空字串(這是debug時看到的，我不清楚為什麼會這樣)，所以這裡採用這種方式
		while (T > 0) {
			StringTokenizer arithmeticExpression = new StringTokenizer(
					input.nextLine(), "+");

			long sum = 0;

			while (arithmeticExpression.hasMoreTokens()) {
				String num = arithmeticExpression.nextToken().trim();
				sum += Long.parseLong(num);
			}

			System.out.println(sum);

			--T;
		}
	}

}
