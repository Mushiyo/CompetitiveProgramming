import java.util.Scanner;

public class Timus1820 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int k = input.nextInt();
			
			if(n <= k){
				System.out.println("2");
			}
			else{
				if((2 * n) % k == 0){
					System.out.println((2 * n) / k);
				}
				else{
					System.out.println(((2 * n) / k) + 1);
				}
			}
		}
	}

}
