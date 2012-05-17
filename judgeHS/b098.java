import java.util.Scanner;

public class b098 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] key = new char[26];
		int n = input.nextInt();
		
		while(n > 0){
			int K = input.nextInt();
			for(int i = 0; i < key.length; ++i){
				if(i < K){
					key[i] = (char) ('A' + (26 - K) + i);
				}
				else{
					key[i] = (char) ('A' + i - K);
				}
			}
			
			String cipher = input.next();
			
			for(int i = 0; i < cipher.length(); ++i){
				System.out.print(key[cipher.charAt(i) - 'A']);
			}
			System.out.println();
			
			--n;
		}
		

	}

}
