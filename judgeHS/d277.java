import java.util.Scanner;

public class d277 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			if(N % 2 == 0){
				System.out.println(N);
			}
			else{
				System.out.println(N - 1);
			}
		}
	}

}
