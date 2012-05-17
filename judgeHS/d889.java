import java.util.Scanner;

public class d889 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			boolean[] timeline = new boolean[10001];
			int nextStartTime = 0;
			
			while(N > 0){
				int arriveTime = input.nextInt();
				if(arriveTime < nextStartTime){
					arriveTime = nextStartTime;
				}
				
				for(int i = arriveTime; i < arriveTime + 5; ++i){
					timeline[i] = true;
				}
				nextStartTime = arriveTime + 5;
				
				--N;
			}
			
			int time = 0;
			while(true){
				while(timeline[time]){
					++time;
				}
				
				int noPatientArriveTime = 0;
				
				while(!timeline[time]){
					++time;
					++noPatientArriveTime;
					if(noPatientArriveTime >= 30){
						break;
					}
				}
				
				if(noPatientArriveTime >= 30){
					break;
				}
			}
			
			System.out.println(time);
		}
	}

}
