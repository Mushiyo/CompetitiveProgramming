//TLE
import java.util.*;

public class Timus1001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Long> num = new ArrayList<Long>();
		
		while(input.hasNext()){
			num.add(input.nextLong());
		}
		
		for(int i = num.size() - 1; i >=0; --i) {
			System.out.printf("%.4f\n", Math.sqrt(num.get(i)));
		}
	}

}
