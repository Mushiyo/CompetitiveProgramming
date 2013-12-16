import java.util.Scanner;

public class UVa11494 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			if((x1 == 0) && (y1 == 0) && (x2 == 0) && (y2 == 0)){
				break;
			}
			
			if((x1 == x2) && (y1 == y2)){
				System.out.println("0");
			}
			else if((Math.abs(x1 - x2) == Math.abs(y1 - y2)) || (x1 == x2) || (y1 == y2)){
				System.out.println("1");
			}
			else{
				System.out.println("2");
			}
		}
	}

}
