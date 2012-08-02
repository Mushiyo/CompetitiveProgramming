import java.util.*;

public class d583 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int[] sitNumber = new int[n];
			
			for(int i = 0; i < sitNumber.length; ++i){
				sitNumber[i] = input.nextInt();
			}
			
			Arrays.sort(sitNumber);
			
			System.out.print(sitNumber[0]);
			for(int i = 1; i < sitNumber.length; ++i){
				System.out.print(" " + sitNumber[i]);
			}
			System.out.println();
		}
	}

}
