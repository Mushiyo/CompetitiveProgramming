import java.util.Scanner;

public class d710 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			String[] brands = new String[n];
			String[] colors = new String[n];
			
			for(int i = 0; i < n; ++i){
				brands[i] = input.next();
				colors[i] = input.next();
			}
			
			while(m > 0){
				String cmd = input.next();
				String cmdOffset = input.next();
				
				if(cmd.equals("brand")){
					for(int i = 0; i < n; ++i){
						if(brands[i].equals(cmdOffset)){
							System.out.println(brands[i] + " " + colors[i]);
						}
					}
				}
				else{
					for(int i = 0; i < n; ++i){
						if(colors[i].equals(cmdOffset)){
							System.out.println(brands[i] + " " + colors[i]);
						}
					}
				}
				
				--m;
			}
			
			if(input.hasNext()){
				System.out.println();
			}
		}
	}

}
