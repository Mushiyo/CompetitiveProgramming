import java.util.Scanner;

public class UVa11547 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int t = input.nextInt();
			
			while(t > 0){
	        	int n = input.nextInt();

	        	int ansPre = (n * 567 / 9 + 7492) * 235 / 47 - 498;
	        	ansPre /= 10;
	        	int ans = ansPre %= 10;

	        	System.out.println(Math.abs(ans));

	        	--t;
	        }
		}
	}

}
