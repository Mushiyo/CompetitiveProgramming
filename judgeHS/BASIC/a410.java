package BASIC;

import java.util.Scanner;

public class a410 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			double a = input.nextInt();
			double b = input.nextInt();
			double c = input.nextInt();
			double d = input.nextInt();
			double e = input.nextInt();
			double f = input.nextInt();
			
			if((a == 0 && d == 0) && (b == 0 && e == 0)){
				if(c == 0 && f == 0){
					System.out.println("Too many");
					continue;
				}
				else{
					System.out.println("No answer");
					continue;
				}
			}
			
			if((a == 0) && (d == 0)){
				if((c == 0) && (f == 0)){
					System.out.println("Too many");
					continue;
				}
				
				if((b / e) == (c / f)){
					System.out.println("Too many");
					continue;
				}
				else{
					System.out.println("No answer");
					continue;
				}
			}
			
			if((b == 0) && (e == 0)){
				if((c == 0) && (f == 0)){
					System.out.println("Too many");
					continue;
				}
				
				if((a / d) == (c / f)){
					System.out.println("Too many");
					continue;
				}
				else{
					System.out.println("No answer");
					continue;
				}
			}
			
			if((c == 0) && (f == 0)){
				if((a / d) == (b / e)){
					System.out.println("Too many");
					continue;
				}
				else{
					
				}
			}
			
			if(((a / d) == (b / e)) && ((b / e) == (c / f))){
				System.out.println("Too many");
			}
			else if(((a / d) == (b / e)) && ((b / e) != (c / f))){
				System.out.println("No answer");
			}
			else{
				double x = (c * e - b * f) / (a * e - b * d);
				double y = (c * d - a * f) / (b * d - a * e);
				
				System.out.printf("x=%.2f\n", x);
				System.out.printf("y=%.2f\n", y);
			}
		}
	}

}
