import java.util.Scanner;

public class b146 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] classTime = new int[8];
		int schoolTime = 0;
		int cramTime = 0;
		
		while(input.hasNext()){
			for(int i = 1; i < classTime.length; ++i){
				schoolTime = input.nextInt();
				cramTime = input.nextInt();
				classTime[i] = schoolTime + cramTime;
			}
			
			int maxClassTime = 0;
			for(int i = 1; i < classTime.length; ++i){
				if(classTime[i] > maxClassTime){
					maxClassTime = classTime[i];
				}
			}
			
			for(int i = 1; i < classTime.length; ++i){
				if(classTime[i] == maxClassTime){
					System.out.println(i);
					break;
				}
			}
		}
	}

}
