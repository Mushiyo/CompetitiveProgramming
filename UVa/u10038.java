import java.util.Scanner;

public class u10038 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int[] series = new int[n];
			
			for(int i = 0; i < series.length; ++i){
				series[i] = input.nextInt();
			}
			
			boolean[] diff = new boolean[n];
			boolean isJolly = true;
			for(int i = 1; i < series.length; ++i){
				int diffAbs = Math.abs(series[i] - series[i - 1]);
				if((diffAbs < n) && (diffAbs > 0)){
					diff[diffAbs] = true;
				}
				else{
					isJolly = false;
					break;
				}
			}
			
			for(int i = 1; i < diff.length; ++i){
				if(!diff[i]){
					isJolly = false;
				}
			}
			
			if(isJolly){
				System.out.println("Jolly");
			}
			else{
				System.out.println("Not jolly");
			}
		}
	}
}
