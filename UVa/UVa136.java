// RE

/* Filename: UVa136.java
 * Author: Mushiyo
 */


import java.util.Scanner;

public class UVa136 {

	public static void main(String[] args) {
		System.out.printf("The 1500'th ugly number is %d.\n", ugly1500());		
	}
	
	static int ugly1500(){
		boolean[] isUgly = new boolean[3000];
		isUgly[1] = true;
		int[] factor = {2, 3, 5};
		
		for(int i = 0; i < factor.length; ++i){
			for(int j = factor[i]; j < isUgly.length; j += factor[i]){
				isUgly[j] = true;
			}
		}
		
		int countUgly = 0;
		int i = 0;
		
		for(; i < isUgly.length && countUgly < 1500; ++i){
			if(isUgly[i]){
				++countUgly;
			}
		}
		
		return i;
	}
}
