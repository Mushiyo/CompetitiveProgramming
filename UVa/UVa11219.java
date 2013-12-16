import java.util.Scanner;

public class UVa11219 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int caseNum = 1;
		
		input.nextLine();//吃掉換行符號
		
		while(N > 0){
			input.nextLine();//吃掉空行
			String[] dateTodayStr = input.nextLine().trim().split("/");
			int[] dateToday = new int[3];
			for(int i = 0; i < dateToday.length; ++i){
				dateToday[i] = Integer.parseInt(dateTodayStr[i]);
			}
			
			String[] birthdayStr = input.nextLine().trim().split("/");
			int[] birthday = new int[3];
			for(int i = 0; i < birthday.length; ++i){
				birthday[i] = Integer.parseInt(birthdayStr[i]);
			}
			
			System.out.print("Case #" + caseNum + ": ");
			if(birthday[2] > dateToday[2]){
				System.out.println("Invalid birth date");
			}
			else if(birthday[2] < dateToday[2]){
				if(birthday[1] > dateToday[1]){
					if(dateToday[2] - birthday[2] - 1 > 130){
						System.out.println("Check birth date");
					}
					else{
						System.out.println(dateToday[2] - birthday[2] - 1);
					}
				}
				else if(birthday[1] < dateToday[1]){
					if(dateToday[2] - birthday[2] > 130){
						System.out.println("Check birth date");
					}
					else{
						System.out.println(dateToday[2] - birthday[2]);
					}
				}
				else{//same month
					if(birthday[0] > dateToday[0]){
						if(dateToday[2] - birthday[2] - 1 > 130){
							System.out.println("Check birth date");
						}
						else{
							System.out.println(dateToday[2] - birthday[2] - 1);
						}
					}
					else{
						if(dateToday[2] - birthday[2] > 130){
							System.out.println("Check birth date");
						}
						else{
							System.out.println(dateToday[2] - birthday[2]);
						}
					}
				}
			}
			else{//same year
				if(birthday[1] > dateToday[1]){
					System.out.println("Invalid birth date");
				}
				else if(birthday[1] < dateToday[1]){
					System.out.println("0");
				}
				else{//same month
					if(birthday[0] > dateToday[0]){
						System.out.println("Invalid birth date");
					}
					else{
						System.out.println("0");
					}
				}
			}
		
			++caseNum;
			--N;
		}
	}
}
