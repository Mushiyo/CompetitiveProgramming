import java.util.Scanner;

public class Timus1082 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			System.out.print(1);
			for(int i = 2; i <= N; ++i){
				System.out.print(" " + i);
			}
			
			System.out.println();
		}
	}

}
