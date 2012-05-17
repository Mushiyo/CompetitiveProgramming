import java.util.Scanner;
import java.util.Arrays;;

public class d732 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int k = input.nextInt();
			
			int[] array = new int[n];
			for(int i = 0; i < n; ++i){
				array[i] = input.nextInt();
			}
			
			while(k > 0){
				int index = Arrays.binarySearch(array, input.nextInt());
				if(index >= 0){
					System.out.println(index + 1);
				}
				else{
					System.out.println(0);
				}
				
				--k;
			}
		}
	}

}
