import java.util.Scanner;

public class d807 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			
			while(n != m){
				if(n > m){
					n -= m;
					continue;
				}
				
				if(m > n){
					m -= n;
					continue;
				}
			}
			
			System.out.println(n);			
		}
	}

}
