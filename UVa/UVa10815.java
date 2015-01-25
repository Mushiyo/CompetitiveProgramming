import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class UVa10815 {

	public static void main(String[] args) {
		TreeSet<String> dictionary = new TreeSet<String>();
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			char[] line = input.nextLine().toLowerCase().toCharArray();
			removeNonAlpha(line);
			
			StringTokenizer token = new StringTokenizer(new String(line));
			
			while(token.hasMoreTokens()){
				dictionary.add(token.nextToken());
			}			
		}
		
		while(!dictionary.isEmpty()){
			System.out.println(dictionary.pollFirst());
		}
	}
	
	private static void removeNonAlpha(char[] string){
		for(int i = 0; i < string.length; ++i){
			if(Character.isAlphabetic(string[i]) == false){
				string[i] = ' ';
			}
		}
	}
}
