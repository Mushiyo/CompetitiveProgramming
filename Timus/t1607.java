import java.util.Scanner;

public class t1607 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int petrOffer = input.nextInt();
			int petrRaise = input.nextInt();
			int driverRequired = input.nextInt();
			int driverReduction = input.nextInt();
			boolean bargaining = true;
			
			while(bargaining){
				if(petrOffer >= driverRequired){
					System.out.println(petrOffer);
					break;
				}

				if(petrOffer + petrRaise >= driverRequired){
					System.out.println(driverRequired);
					break;
				}
				else{
					petrOffer += petrRaise;
				}
				
				if(driverRequired - driverReduction <= petrOffer){
					System.out.println(petrOffer);
					break;
				}
				else{
					driverRequired -= driverReduction;
				}	
			}
		}
	}

}
