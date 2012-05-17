import java.util.Scanner;

public class c009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String num = input.next();
			if (num.startsWith("-")) {
				break;
			}

			if (num.startsWith("0x")) {
				num = num.substring(2);
				System.out.println(Integer.parseInt(num, 16));
			} 
			else {				
				System.out.println("0x" + Integer.toHexString(Integer.valueOf(num)).toUpperCase());
			}
		}
	}

}
