

import java.util.Scanner;
import java.util.Arrays;

public class cf370C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE = 5000;
		int[] colors = new int[SIZE];
		int[] leftHand = new int[SIZE];
		int[] rightHand = new int[SIZE];

		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			
			for(int i = 0; i < n; ++i){
				colors[i] = input.nextInt();
			}
			
//			for(int i : colors){
//				System.out.print(i + " ");
//			}
//			System.out.println();
			
			Arrays.sort(colors, 0, n);
//			for(int i : colors){
//				System.out.print(i + " ");
//			}
//			System.out.println();
			
			int insPoint = 0;
			for(int i = 0; i < n; ++i){
				leftHand[insPoint] = colors[i];
				//System.out.print(colors[i] + " ");
				insPoint += 2;
				if(insPoint >= n){
					insPoint = 1;
				}
			}
			
			rightHand[n - 1] = leftHand[0];
			for(int i = 1; i < n; ++i){
				rightHand[i - 1] = leftHand[i];
			}
			
			int countDiff = 0;
			for(int i = 0; i < n; ++i){
				if(leftHand[i] != rightHand[i]){
					++countDiff;
				}
			}
			
			System.out.println(countDiff);
			for(int i = 0; i < n; ++i){
				System.out.println(leftHand[i] + " " + rightHand[i]);
			}
		}
	}
}
