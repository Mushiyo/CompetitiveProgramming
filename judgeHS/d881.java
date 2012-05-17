import java.util.Scanner;

public class d881 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arithSeq = new int[49];
		
		while(input.hasNext()){
			int d = input.nextInt();
			
			for(int i = 0; i < arithSeq.length; ++i){
				arithSeq[i] = (1 + d * i);
			}
			
			int[] solSeq = new int[50];
			solSeq[0] = 1;
			for(int i = 1; i < solSeq.length; ++i){
				solSeq[i] = solSeq[i - 1] + arithSeq[i - 1];
			}
			
			int sol = 0;
			for(int i = 0; i < solSeq.length; ++i){
				sol += solSeq[i];
			}
			
			System.out.println(sol);
		}
	}

}
