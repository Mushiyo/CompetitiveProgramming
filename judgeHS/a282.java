import java.util.Scanner;

public class a282 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			boolean[] page = new boolean[2001];
			
			while(n > 0){
				page[input.nextInt()] = true;
				--n;
			}
			
			for(int i = 1; i < page.length; ++i){
				if(page[i] == false){
					System.out.println(i);
					break;
				}
			}
		}
	}

}
