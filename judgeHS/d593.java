import java.util.Scanner;

public class d593 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int L = input.nextInt();
			
			while(String.valueOf(L).length() > 1){
				String LStr = String.valueOf(L);
				L = 0;
				
				for(int i = 0; i < LStr.length(); ++i){
					L += LStr.charAt(i) - '0';
				}
			}
			
			System.out.print(L + ", ");
			if(L == 2){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			--N;
		}
	}

}
