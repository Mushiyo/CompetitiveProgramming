import java.util.Scanner;
import java.util.StringTokenizer;

public class UVa579 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String time = input.next();
			
			if(time.equals("0:00")){
				break;
			}
			
			StringTokenizer tok = new StringTokenizer(time, ":");
			int H = Integer.parseInt(tok.nextToken());
			int M = Integer.parseInt(tok.nextToken());
			
            //let 12 be 0°, 3 be 90° ...
			double angleBetweenHM = Math.abs(M * 6 - ((H % 12) * 30 + 0.5 * M));
			if(angleBetweenHM > 180){
				System.out.printf("%.3f\n", 360 - angleBetweenHM);
			}
			else{
				System.out.printf("%.3f\n", angleBetweenHM);
			}
		}
	}

}
