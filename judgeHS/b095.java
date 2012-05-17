import java.util.Scanner;

public class b095 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int max = Math.max(num1, num2);
			
			int[] response = new int[30];
			for(int i = 0; i < response.length; ++i){
				response[i] = input.nextInt();
			}
			
			int countWrong = 0;
			boolean correct = false;
			for(int i = 0; i < response.length; ++i){
				if(response[i] == 0){
					continue;
				}
				else if(response[i] != max){
					++countWrong;
					if(countWrong >= 3){
						break;
					}
				}
				else{
					correct = true;
					break;
				}
			}
			
			if(correct){
				System.out.println("Y");
			}
			else{
				System.out.println("N");
			}
			
		}
	}

}
