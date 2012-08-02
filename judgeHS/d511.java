import java.util.Scanner;

public class d511 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = 5;
		int score = 0;
		
		while(days > 0){
			int side1 = input.nextInt();
			int side2 = input.nextInt();
			int side3 = input.nextInt();
			if((side1 + side2 > side3) && (Math.abs(side1 - side2) < side3)){
				++score;
			}
			
			--days;
		}
		
		System.out.println(score);
	}

}
