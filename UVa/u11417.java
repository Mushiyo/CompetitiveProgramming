import java.util.Scanner;

public class u11417 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			int G = 0;
			
			for(int i=1;i<N;i++){
				for(int j=i+1;j<=N;j++){					
					G += gcd(i, j);
				}
			}
			
			System.out.println(G);
		}
	}
	
	public static int gcd(int a, int b){
		while(Math.min(a,b) != 0){
			if(a >= b){
				int r = a % b;
				a = b;
				b = r;
			}
			else{
				int r = b % a;
				b = a;
				a = r;
			}
		}
		
		return Math.max(a, b);
	}

}
