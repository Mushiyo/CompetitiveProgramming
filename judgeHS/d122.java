import java.util.Scanner;

public class d122 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long n = input.nextLong();
			long zeroNum = 0;
			long fives = 5;
			
			while(n / fives != 0){
				zeroNum += n / fives;
				fives *= 5;
			}
			
			System.out.println(zeroNum);
		}
	}

}
