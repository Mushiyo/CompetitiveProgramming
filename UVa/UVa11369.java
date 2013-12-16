import java.util.Scanner;
import java.util.Arrays;

public class UVa11369 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		while(t > 0){
			int n = input.nextInt();
			int[] price = new int[n];
			for(int i = 0; i < price.length; ++i){
				price[i] = input.nextInt();
			}
			
			Arrays.sort(price);
			
			int savedMoney = 0;
			for(int i = 0; i < price.length; ++i){
				if((i - n % 3) % 3 == 0){
					savedMoney += price[i];
				}
			}
			System.out.println(savedMoney);
			
			--t;
		}
	}

}
