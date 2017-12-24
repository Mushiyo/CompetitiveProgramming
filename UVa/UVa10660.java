/* Filename: UVa10660.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10660 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int t = input.nextInt();
			
			while(t > 0){
				int n = input.nextInt();
				Record[] rec = new Record[n];
				
				for(int i = 0; i < rec.length; ++i){
					rec[i] = new Record(input.nextInt(), input.nextInt(), input.nextInt());
				}
				
				int minDist = Integer.MAX_VALUE;
				int[] officeLocation = new int[5];
				for(int i = 0; i < 25; ++i){
					for(int j = i + 1; j < 25; ++j){
						for(int k = j + 1; k < 25; ++k){
							for(int l = k + 1; l < 25; ++l){
								for(int m = l + 1; m < 25; ++m){
									int dist = 0;
									for(int x = 0; x < rec.length; ++x){
										dist += Math.min(rec[x].dist(i), Math.min(rec[x].dist(j),Math.min(rec[x].dist(k), Math.min(rec[x].dist(l), rec[x].dist(m)))));
									}
									
									if(dist < minDist){
										minDist = dist;
										officeLocation[0] = i;
										officeLocation[1] = j;
										officeLocation[2] = k;
										officeLocation[3] = l;
										officeLocation[4] = m;
									}
								}
							}
						}
					}
				}
				
				System.out.print(officeLocation[0]);
				for(int i = 1; i < officeLocation.length; ++i){
					System.out.printf(" %d", officeLocation[i]);
				}
				System.out.println();
				
				--t;
			}
		}
	}

	private static class Record{
		int row;
		int col;
		int population;
		
		Record(int row, int col, int population){
			this.row = row;
			this.col = col;
			this.population = population;
		}
		
		int dist(int areaId){
			int row = areaId / 5;
			int col = areaId % 5;
			
			return this.population * (Math.abs(this.row - row) + Math.abs(this.col - col));
		}
	}
}
