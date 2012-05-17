import java.util.Scanner;

public class t1636 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int timeQXX = input.nextInt();
			int timeZZZ = input.nextInt();
			int[] rejectedRun = new int[10];
			
			for(int i = 0; i < rejectedRun.length; ++i){
				rejectedRun[i] = input.nextInt();
				timeZZZ -= rejectedRun[i] * 20;
			}
			
			if(timeZZZ < timeQXX){
				System.out.println("Dirty debug :(");
			}
			else{
				System.out.println("No chance.");
			}
		}
	}

}
