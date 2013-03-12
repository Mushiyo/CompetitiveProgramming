//MLE
package ORIGINAL;

import java.util.Scanner;
import java.util.Arrays;

public class d075 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[100001];
		int numSize = 0;
				
		for(int i = 0; input.hasNext(); ++i, ++numSize){
			num[i] = input.nextInt();			
		}
		
		Arrays.sort(num);
		
		for(int i = num.length - numSize ; i < num.length; ++i){
			System.out.print(num[i] + " ");
		}
	}

}
