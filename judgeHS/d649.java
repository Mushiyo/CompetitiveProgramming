import java.util.Arrays;
import java.util.Scanner;

public class d649 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			char[] aLineOfTriangle = new char[N];
			Arrays.fill(aLineOfTriangle, '_');
			
			for(int i = 0; i < aLineOfTriangle.length; ++i){
				aLineOfTriangle[N - i - 1] = '+';
				System.out.println(aLineOfTriangle);
			}
			
			System.out.println();
		}
	}

}
