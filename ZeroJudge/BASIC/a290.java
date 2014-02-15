//TLE

package BASIC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;

public class a290 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			
			List<ArrayList<Integer>> roads = new ArrayList<ArrayList<Integer>>(N + 1);
			for(int i = 0; i < N + 1; ++i){
				roads.add(new ArrayList<Integer>());
			}
			
			boolean[] visited = new boolean[roads.size()];
			
			while(M > 0){
				int a = input.nextInt();
				int b = input.nextInt();
				
				roads.get(a).add(b);
				
				--M;
			}
			
			int A = input.nextInt();
			int B = input.nextInt();
			
			if(isReachable(A, B, roads, visited)){
				System.out.println("Yes!!!");
			}
			else{
				System.out.println("No!!! ");
			}
			
		}	
		
	}
	
	static boolean isReachable(int startCity, int targetCity, List<ArrayList<Integer>> roads, boolean[] visited){
		Queue<Integer> toBeVisit = new LinkedList<Integer>();
		toBeVisit.add(startCity);

		while(!toBeVisit.isEmpty()){
			int currentCity = toBeVisit.poll();
			
			if(currentCity == targetCity){
				return true;
			}
			
			for(int i = 0; i < roads.get(currentCity).size(); ++i){
				int neighborCity = roads.get(currentCity).get(i);
				
				if(neighborCity == targetCity){
					return true;
				}
				
				if(!visited[neighborCity]){
					toBeVisit.add(neighborCity);
					visited[neighborCity] = true;
				}
			}
		}
		
		return false;
	}
}
