/* Filename: d242.java
 * Author: Mushiyo
 */
package UVa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class d242 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		while(input.hasNext()){
			num.add(input.nextInt());
		}
		
		ArrayList<Integer> LISDP = new ArrayList<Integer>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] parentIndex = new int[num.size()];
		Arrays.fill(parentIndex, -1);
		for(int i = 0; i < num.size(); ++i){
			int insPoint = Collections.binarySearch(LISDP, num.get(i));
			insPoint = Math.max(insPoint, -(insPoint + 1));
			
			if(insPoint == LISDP.size()){
				LISDP.add(num.get(i));
				index.add(i);
			} else {
				LISDP.set(insPoint, num.get(i));
				index.set(insPoint, i);
			}
			
			if(insPoint > 0){
				parentIndex[i] = index.get(insPoint - 1);
			}
		}
		
		int LISLen = LISDP.size();
		int LISEndIndex = index.get(LISDP.size() - 1);
		int[] LIS = new int[LISLen];
		for(int i = LIS.length - 1, current = LISEndIndex; current != -1 && i >= 0; --i){
			LIS[i] = num.get(current);
			current = parentIndex[current];
		}
		
		System.out.println(LISLen);
		System.out.println('-');
		for(int i = 0; i < LIS.length; ++i){
			System.out.println(LIS[i]);
		}
	}
}
