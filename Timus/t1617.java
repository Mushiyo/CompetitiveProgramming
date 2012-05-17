import java.util.Scanner;

public class t1617 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			int[] tire = new int[101];
			while(n > 0){
				++tire[input.nextInt() - 600];
				--n;
			}
			
			int wheelSet = 0;
			for(int i = 0; i < tire.length; ++i){
				wheelSet += (tire[i] / 4);
			}
			
			System.out.println(wheelSet);
		}
	}

}
