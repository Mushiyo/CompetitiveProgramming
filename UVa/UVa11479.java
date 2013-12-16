import java.util.Scanner;

public class UVa11479 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		long[] side = new long[3];
		int caseNum = 1;
		
		while(T > 0){
			for(int i = 0; i < side.length; ++i){
				side[i] = input.nextInt();
			}
			
			System.out.print("Case " + caseNum + ": ");
			if((side[0] < side[2] + side[1]) && (side[0] > Math.abs(side[2] - side[1]))){
				if((side[0] == side[1]) && (side[1] == side[2])){
					System.out.println("Equilateral");
				}
				else if((side[0] != side[1]) && (side[1] != side[2]) && (side[0] != side[2])){
					System.out.println("Scalene");
				}
				else{
					System.out.println("Isosceles");
				}
			}
			else{
				System.out.println("Invalid");
			}
		
			++caseNum;
			--T;
		}
		
	}
}
