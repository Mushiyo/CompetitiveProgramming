
import java.util.Scanner;

public class UVa10115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int ruleNum = input.nextInt();
			
			if(ruleNum == 0){
				break;
			}
			
			input.nextLine(); // eat change line
			
			String[] find = new String[ruleNum];
			String[] replace = new String[ruleNum];
			for(int i = 0; i < ruleNum; ++i){
				find[i] = input.nextLine();
				replace[i] = input.nextLine();
			}
			
			StringBuilder text = new StringBuilder(input.nextLine());
			
			for(int i = 0; i < ruleNum; ++i){
				int indexOfFind = text.indexOf(find[i]);
				
				while(indexOfFind != -1){
					text.delete(indexOfFind, indexOfFind + find[i].length());
					text.insert(indexOfFind, replace[i]);
					indexOfFind = text.indexOf(find[i]);
				}
			}
			
			System.out.println(text);
		}
	}

}
