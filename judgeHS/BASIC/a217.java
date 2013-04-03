package BASIC;

import java.util.Scanner;

public class a217 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int testCase = input.nextInt();

			while (testCase > 0) {
				int x = input.nextInt();
				int y = input.nextInt();
				int z = input.nextInt();
				int w = input.nextInt();
				int n = input.nextInt();
				int m = input.nextInt();
				
				input.nextLine();//eat change line

				long weight = m;
				boolean isDead = false;
				String carrots = input.nextLine();
				
				if (carrots.equals("")) {
					System.out.println(m + "g");
					--testCase;
					continue;
				}
				else {
					long poison = 0;

					for(int i = 0; i < carrots.length(); i += 2) {	
						int carrotType = carrots.charAt(i) - '0';
						
						if(poison > 0){
							weight -= poison;
						}
						
						if(weight < 0){
							isDead = true;
							break;
						}

						switch (carrotType) {
						case 1:
							weight += x;
							break;
						case 2:
							weight += y;
							break;
						case 3:
							weight -= z;
							break;
						case 4:
							weight -= w;
							poison += n;
							break;
						}
					}
					
					if(weight < 0){
						isDead = true;
					}
					
					if(isDead){
						System.out.println("bye~Rabbit");
					}
					else{
						System.out.println(weight + "g");
					}
				}

				--testCase;
			}
		}
	}
}
