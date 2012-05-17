import java.util.Scanner;

public class b075 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		
		while(k > 0){
			int n = input.nextInt();
			String openTime = input.next();
			int openTimeMin = hourToMinute(openTime);
			String closeTime = input.next();
			int closeTimeMin = hourToMinute(closeTime);
			
			while(n > 0){
				String stuName = input.next();
				String costTime = input.next();
				int costTimeMin = hourToMinute(costTime);
				int leaveTime1 = openTimeMin - costTimeMin;
				int leaveTime2 = closeTimeMin - costTimeMin;
				
				System.out.printf("%02d:%02d %02d:%02d\n", leaveTime1 / 60, leaveTime1 % 60, leaveTime2 / 60, leaveTime2 % 60);
				
				--n;
			}
			
			--k;
		}
	}
	
	public static int hourToMinute(String hour){
		return 60 * Integer.parseInt(hour.substring(0, 2)) + Integer.parseInt(hour.substring(3));
	}
}
