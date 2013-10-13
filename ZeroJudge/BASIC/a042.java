package BASIC;

import java.util.Scanner;

public class a042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int numOfCircle = input.nextInt();
			System.out.println(countDividion(numOfCircle));
		}
	}
	
	public static int countDividion(int numOfCircle){
		if(numOfCircle < 1){
			return 0;
		}
		
		if(numOfCircle == 1){
			return 2;
		}
		else{
			return countDividion(numOfCircle - 1) + 2 * (numOfCircle - 1);
		}
	}

}
