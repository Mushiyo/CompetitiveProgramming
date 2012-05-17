import java.util.Scanner;

public class t1785 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			if(n < 100){
				if(n < 20){
					if(n < 10){
						if(n < 5){
							System.out.println("few");
						}
						else{
							System.out.println("several");
						}
					}
					else{
						System.out.println("pack");
					}
				}
				else{
					if(n < 50){
						System.out.println("lots");
					}
					else{
						System.out.println("horde");
					}					
				}
			}
			else{
				if(n < 500){
					if(n < 250){
						System.out.println("throng");
					}
					else{
						System.out.println("swarm");
					}
				}
				else{
					if(n < 1000){
						System.out.println("zounds");
					}
					else{
						System.out.println("legion");
					}
				}				
			}
		}
	}

}
