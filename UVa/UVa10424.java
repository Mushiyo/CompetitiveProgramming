/* Filename: UVa10424.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10424 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String name1 = input.nextLine();
			String name2 = input.nextLine();
			
			int name1Val = nameValue(name1);
			int name2Val = nameValue(name2);
			double love = Math.min((name1Val * 100) / (double) name2Val , (name2Val * 100) / (double) name1Val);
			
			System.out.printf("%.2f %%\n", love);
		}
	}
	
	static int nameValue(String name){
		int val = 0;
		
		name = name.toLowerCase();
		for(int i = 0; i < name.length(); ++i){
			if(Character.isLetter(name.charAt(i))){
				val += name.charAt(i) - 'a' + 1;
			}
		}
		
		while(val >= 10){
			val = digitSum(val);
		}
		
		return val;
	}
	
	static int digitSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
