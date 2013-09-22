import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			ConvertibleStrings cs = new ConvertibleStrings();
			
			cs.leastRemovals(input.nextLine(), input.nextLine());
		}
	}

}
