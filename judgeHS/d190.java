import java.util.Scanner;

public class d190 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int[] ageCount = new int[101];
			int n = input.nextInt();
			int maxAge = 0;
			
			if(n == 0){
				break;
			}
			
			while(n > 0){
				int age = input.nextInt();
				
				if(age > maxAge){
					maxAge = age;
				}
				
				++ageCount[age];				
				--n;
			}
			
			for(int i = 1; i < ageCount.length; ++i){
				
				for(int j = 1; j < ageCount[i]; ++j){
					System.out.print(i + " ");
				}
				
				if(ageCount[i] > 0){
					if(i != maxAge){
						System.out.print(i + " ");
					}
					else{
						System.out.println(i);
					}
				}
			}
		}
		
	}

}
