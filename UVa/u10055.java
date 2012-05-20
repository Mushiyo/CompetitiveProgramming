import java.util.Scanner;

public class u10055 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		   
		  while(input.hasNext()){
		   long num1 = input.nextLong();
		   long num2 = input.nextLong();
		    
		   System.out.println(Math.abs(num1 - num2));
		  }
	}
}
