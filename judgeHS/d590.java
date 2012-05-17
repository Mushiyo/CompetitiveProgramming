import java.util.Scanner;

public class d590 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			if(((n + m) % 2) != 0){
				System.out.println("Loss");
			}
			else{
				System.out.println("Win");
			}
		}
	}

}
