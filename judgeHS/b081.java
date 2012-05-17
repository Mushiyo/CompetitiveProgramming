import java.util.Scanner;

public class b081 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long n = input.nextLong();
			
			if(n == 0){
				break;
			}
			
			long sumOfProperDivisor = 0;
			for(long i = 1; i < n; ++i){
				if(n % i == 0){
					sumOfProperDivisor += i;
				}
			}
			
			if(n == sumOfProperDivisor){
				System.out.println("=" + n);
				continue;
			}
			
			if(isAmicableNum(n, sumOfProperDivisor)){
				System.out.println(sumOfProperDivisor);
			}
			else{
				System.out.println(0);
			}
		}
	}
	
	public static boolean isAmicableNum(long a, long b){
		long sumOfProperDivisor = 0;
		
		for(long i = 1; i < b; ++i){
			if(b % i == 0){
				sumOfProperDivisor += i;
			}
		}
		
		if(a != sumOfProperDivisor){
			return false;
		}
		else{
			return true;
		}
	}

}
