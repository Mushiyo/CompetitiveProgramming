//TLE
package UVa;

import java.util.Scanner;
import java.util.Arrays;

public class c010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[1];
		int size = 1;
		
		while(input.hasNext()){
			num[size - 1] = input.nextInt();
			
			Arrays.sort(num);
			if(size % 2 != 0){
				System.out.println(num[size / 2]);
			}
			else{
				int num1 = num[size / 2 - 1];
				int num2 = num[size / 2];
				System.out.println((num1 + num2) / 2);
			}
			
			++size;
			num = Arrays.copyOf(num, size);
		}
	}

}
