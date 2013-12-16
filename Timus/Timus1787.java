import java.util.Scanner;

public class Timus1787 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int k = input.nextInt();
			int n = input.nextInt();
			
			int inJam = 0;
			while(n > 0){
				int ai = input.nextInt();
				
				inJam += ai;
				inJam -= k;
				
				if(inJam < 0){
					inJam = 0;
				}
				
				--n;
			}
			
			System.out.println(inJam);			
		}
	}

}
