import java.util.Scanner;

public class a244 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int a = input.nextInt();
			long b = input.nextLong();
			long c = input.nextLong();
			
			switch(a){
				case 1:
					System.out.println(b + c);
					break;
					
				case 2:
					System.out.println(b - c);
					break;
					
				case 3:
					System.out.println(b * c);
					break;
					
				default:
					System.out.println(b / c);
					break;
			}
			
			--N;
		}
		
	}

}
