/* Filename: UVa10102.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.awt.Point;
import java.util.List;
import java.util.ArrayList;

public class UVa10102 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			List<Point> onePos = new ArrayList<Point>();
			List<Point> threePos = new ArrayList<Point>();
			int M = input.nextInt();
			
			for(int i = 0; i < M; ++i){
				String rowOfCell = input.next();
				for(int j = 0; j < M; ++j){
					int cell = rowOfCell.charAt(j) - '0';
					
					if(cell == 1){
						onePos.add(new Point(i, j));
					}
					
					if(cell == 3){
						threePos.add(new Point(i, j));
					}
				}
			}
			
			int minStep = 0;
			for(int i = 0; i < onePos.size(); ++i){
				Point cell1 = onePos.get(i);
				
				int nearestDist = Integer.MAX_VALUE;
				for(int j = 0; j < threePos.size(); ++j){
					Point cell3 = threePos.get(j);
					
					nearestDist = Math.min(nearestDist, ManhattanDistance(cell1, cell3));
				}
				
				minStep = Math.max(minStep, nearestDist);
			}
			
			System.out.println(minStep);
		}
	}
	
	public static int ManhattanDistance(Point p1, Point p2){
		return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
	}
}
