/* Filename: AGC004B.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class AGC004B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt(), x = input.nextInt();
			int[] a = new int[N];
			boolean[] isCatched = new boolean[N];
			int countCatched = 0;
			long time = 0;
			for (int i = 0; i < a.length; ++i) {
				a[i] = input.nextInt();
			}
			
			while (countCatched < N) {
				int min = Integer.MAX_VALUE;
				int minIndex = -1;
				for(int j = 0; j < isCatched.length; ++j){
					if(a[j] <= x && isCatched[j] == false){
						if(a[j] < min){
							min = a[j];
							minIndex = j;
						}
					}
				}
				
				if(minIndex >= 0){
					isCatched[minIndex] = true;
					time += a[minIndex];
					++countCatched;
				} else {
					rightShift(isCatched);
					time += x;
				}
				
				
			}

			/*while (countCatched < N) {
				//System.err.println(countCatched);
				//System.err.println(Arrays.toString(isCatched));
				int i = 0;
				while (i < isCatched.length && isCatched[i]) {
					++i;
				}

				if (a[i] <= x) {
					time += a[i];
					isCatched[i] = true;
					++countCatched;
				} else {
					rightShift(isCatched);
					time += x;
					
					int min = Integer.MAX_VALUE;
					int minIndex = -1;
					for(int j = 0; j < isCatched.length; ++j){
						if(a[j] <= x && isCatched[j] == false){
							if(a[j] < min){
								min = a[j];
								minIndex = j;
							}
						}
					}
					
					if(minIndex >= 0){
						isCatched[minIndex] = true;
						time += a[minIndex];
						++countCatched;
					}
				}
			}*/

			System.out.println(time);
		}
	}

	private static void rightShift(boolean[] a) {
		boolean tmp = a[a.length - 1]; 
		for (int i = a.length - 1; i > 0; --i) {
			a[i] = a[i - 1];
		}

		a[0] = tmp;
	}

}
