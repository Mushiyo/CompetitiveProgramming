import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Timus1563 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			Set<String> store = new HashSet<String>(N);
			int BayanTimes = 0;
			
			input.nextLine();//¦Y±¼´«¦æ²Å¸¹
			while(N > 0){
				String storeName = input.nextLine();
				
				if(store.contains(storeName)){
					++BayanTimes;
				}
				else{
					store.add(storeName);
				}
				
				--N;
			}
			
			System.out.println(BayanTimes);
		}
	}

}
