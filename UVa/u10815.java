
import java.util.Scanner;
import java.util.TreeSet;

public class u10815 {

	public static void main(String[] args) {
		TreeSet<String> dictionary = new TreeSet<String>();
		Scanner input = new Scanner(System.in).useDelimiter("[^a-zA-Z]");
		
		while(input.hasNext()){
			dictionary.add(input.next().toLowerCase());
		}
		
		while(!dictionary.isEmpty()){
			System.out.println(dictionary.pollFirst());
		}
	}

}
