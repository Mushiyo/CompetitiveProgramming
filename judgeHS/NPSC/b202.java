package NPSC;

import java.util.*;

public class b202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		
		while(k > 0){
			Set<Integer> price = new HashSet<Integer>();
			for(int i  = 1; i <= 3; ++i){
				price.add(input.nextInt());
			}
			
			if(price.size() < 3){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
			--k;
		}
	}

}
