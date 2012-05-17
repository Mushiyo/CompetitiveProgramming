import java.util.Scanner;

public class a215 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			int sum = n;
			int count = 1;
			
			while(!(sum > m)){
				sum += (++n);
				++count;
			}
			
			System.out.println(count);
		}
	}

}
