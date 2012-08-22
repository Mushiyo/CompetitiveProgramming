import java.util.Scanner;

public class u10161 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N != 0){
			int areaNum = 1;
			while(areaNum * areaNum < N){
				++areaNum;				
			}
			
			int middleNumInArea = areaNum * areaNum - (areaNum - 1);
			int x = 1, y = 1;
			if(areaNum % 2 == 0){
				if(N < middleNumInArea){
					x = areaNum - Math.abs(middleNumInArea - N);
					y = areaNum;
				}
				else if(N > middleNumInArea){
					x = areaNum;
					y = areaNum - Math.abs(middleNumInArea - N);
				}
				else{
					x = y = areaNum;
				}
			}
			else{
				if(N > middleNumInArea){
					x = areaNum - Math.abs(middleNumInArea - N);
					y = areaNum;
				}
				else if(N < middleNumInArea){
					x = areaNum;
					y = areaNum - Math.abs(middleNumInArea - N);
				}
				else{
					x = y = areaNum;
				}
			}
			
			System.out.println(x + " " + y);
			
			N = input.nextInt();
		}
		
	}
}
