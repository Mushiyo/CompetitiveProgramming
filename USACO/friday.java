/*
ID: mushiyo1
LANG: JAVA
TASK: friday
*/

import java.util.Scanner;
import java.io.*;

public class friday {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("friday.in"));
		PrintWriter output = new PrintWriter(new File("friday.out"));
		int[] countThirteen = new int[7];
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(input.hasNext()){
			int N = input.nextInt();
			int day = 2;
			
			for(int i = 0; i < N; ++i){
				if(isLeapYear(1900 + i)) daysInMonth[1] = 29;
				else daysInMonth[1] = 28;
				
				for(int month = 1; month <= 12; ++month){
					for(int date = 1; date <= daysInMonth[month - 1]; ++date){
						if(date == 13){
							++countThirteen[day];
						}
						++day;
						day %= 7;
					}
				}
			}
			
			output.print(countThirteen[0]);
			for(int j = 1; j < countThirteen.length; ++j){
				output.print(" " + countThirteen[j]);
			}
			output.println();
		}
		
		input.close();
		output.close();
	}

	public static boolean isLeapYear(int year){
		if(year % 400 == 0) return true;
		if(year % 100 == 0) return false;
		if(year % 4 == 0) return true;
		
		return false;
	}
}
