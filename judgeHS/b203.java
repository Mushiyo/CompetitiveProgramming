import java.util.Scanner;

public class b203 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		int setNum = 1;
		
		while(K > 0){
			System.out.println("DATA SET #" + setNum +":");
			
			String dirtName = input.next().replaceAll("#", ".*");
			
			int M = input.nextInt();
			while(M > 0){
				if(input.next().matches(dirtName)){
					System.out.println("POSSIBLE");
				}
				else{
					System.out.println("IMPOSSIBLE");
				}
				--M;
			}
			
			--K;
			++setNum;
		}
	}

}
