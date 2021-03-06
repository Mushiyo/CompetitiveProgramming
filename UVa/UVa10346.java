import java.util.Scanner;

public class UVa10346 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int k = input.nextInt();
			long smoked = n;
			
			while(n / k != 0){
				smoked += n / k;
				n = n / k + n % k;
			}
			
			System.out.println(smoked);
		}
	}

}
