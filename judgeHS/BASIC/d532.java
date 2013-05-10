package BASIC;

import java.util.Scanner;

public class d532 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			int leapYearNum = 0;
			for(int year = a; year <= b; ++year){
				if(isLeapYear(year)){
					++leapYearNum;
				}
			}
			
			System.out.println(leapYearNum);
		}
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;

		return false;
	}

}
