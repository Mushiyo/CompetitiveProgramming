import java.util.Scanner;

public class b138 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int[] appleHeight = new int[10];
			for(int i = 0; i < appleHeight.length; ++i){
				appleHeight[i] = input.nextInt();
			}
			
			int reachHeight = input.nextInt() + 30;
			int reachedApple = 0;
			
			for(int i : appleHeight){
				if(i <= reachHeight){
					++reachedApple;
				}
			}
			
			System.out.println(reachedApple);
		}
	}

}
