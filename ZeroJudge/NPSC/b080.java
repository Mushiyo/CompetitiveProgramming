package NPSC;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class b080 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a == 0 && b == 0){
				break;
			}
			
			if(a == Math.max(a, b)){
				int tmp = b;
				b =  a;
				a = tmp;
			}
			
			Double[] hypot = new Double[2];
			
			hypot[0] = Math.hypot(a, b);
			hypot[1] = Math.sqrt(b * b - a * a);
			
			TreeSet<Double> hypots = new TreeSet<Double>();
			for(int i = 0; i < hypot.length; ++i){
				if(hypot[i].doubleValue() == hypot[i].intValue()){
					hypots.add(hypot[i]);
				}
			}
			
			Iterator<Double> iterate = (Iterator<Double>)hypots.iterator();
			
			if(hypots.size() == 0){
				System.out.print("Wrong");
			}
			else{
				iterate = hypots.iterator();
				System.out.print(iterate.next().intValue());
				while(iterate.hasNext()){
					System.out.print(" " + iterate.next().intValue());
				}
			}
			System.out.println();
		}
	}

}
