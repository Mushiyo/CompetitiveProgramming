package UVa;

import java.util.ArrayList;
import java.util.Scanner;

public class a158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			input.nextLine(); // eat change line
			
			while(N > 0){
				Scanner numIn = new Scanner(input.nextLine());
				ArrayList<Integer> num = new ArrayList<Integer>();
				
				while(numIn.hasNext()){
					num.add(numIn.nextInt());
				}
				
				int maxGCD = 0;
				for(int i = 0; i < num.size(); ++i){
					for(int j = i + 1; j < num.size(); ++j){
						int currentGCD = gcd(num.get(i), num.get(j));
						
						if(currentGCD > maxGCD){
							maxGCD = currentGCD;
						}
					}
				}
				
				System.out.println(maxGCD);
				
				--N;
			}
		}
	}
	
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}
		else{
			return gcd(b, a % b);
		}
	}
}
