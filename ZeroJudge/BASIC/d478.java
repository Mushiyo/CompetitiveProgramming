//TLE
package BASIC;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class d478 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		while(n > 0){
			Set<Integer> panNum = new HashSet<Integer>(m);
			for(int i = 0; i < m; ++i){
				panNum.add(input.nextInt());
			}
			
			Set<Integer> flowerNum = new HashSet<Integer>(m);
			for(int i = 0; i < m; ++i){
				flowerNum.add(input.nextInt());
			}
			
			Set<Integer> commonNum = new HashSet<Integer>(panNum);
			commonNum.retainAll(flowerNum);//取小潘跟小花的交集
			
			System.out.println(commonNum.size());
			
			--n;
		}
		
	}

}
