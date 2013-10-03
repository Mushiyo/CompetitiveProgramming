//TLE
package BASIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class d550 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RowComparator rowComp= new RowComparator();
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			
			Row[] rows = new Row[N];
			for(int i = 0; i < rows.length; ++i){
				 rows[i] = new Row(M);
				 for(int j = 0; j < rows[i].num.length; ++j){
					 rows[i].num[j] = input.nextInt();
				 }
			}
			
			Arrays.sort(rows, rowComp);
			
			for(int i = 0; i < rows.length; ++i){
				System.out.print(rows[i].num[0]);
				for(int j = 1; j < rows[i].num.length; ++j){
					System.out.print(" " + rows[i].num[j]);
				}
				
				System.out.println();
			}
		}
	}

}

class Row{
	//ArrayList<Integer> num;
	int[] num;
//	Row(ArrayList<Integer> num){
//		this.num = num;
//	}
	
	Row(int size){
		num = new int[size];
	}
}

class RowComparator implements Comparator<Row>{
	public int compare(Row r1, Row r2) {
//		for(int i = 0; i < r1.num.size();++i){
//			if(r1.num.get(i) > r2.num.get(i)){
//				return 1;
//			}
//			else if(r1.num.get(i) < r2.num.get(i)){
//				return -1;
//			}
//		}
		
		for(int i = 0; i < r1.num.length; ++i){
			if(r1.num[i] > r2.num[i]){
				return 1;
			}
			else if(r1.num[i] < r2.num[i]){
				return -1;
			}
		}
		
		return 0;
	}
	
}
