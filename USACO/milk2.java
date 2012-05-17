/*
ID: mushiyo1
LANG: JAVA
TASK: milk2
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class milk2 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("milk2.in"));
		PrintWriter output = new PrintWriter(new File("milk2.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			boolean[] timeline = new boolean[1000001];
			int firstStartTime = 1000000;
			int lastEndTime = 0;
			
			while(N > 0){
				int startTime = input.nextInt();
				if(firstStartTime > startTime){
					firstStartTime = startTime;
				}
				
				int endTime = input.nextInt();
				if(lastEndTime < endTime){
					lastEndTime = endTime;
				}
				
				for(int i = startTime; i < endTime; ++i){
					timeline[i] = true;
				}
				
				--N;
			}
			
			int longestMilking = 0;
			int longestNoMilking = 0;
			int time = firstStartTime;
			
			while(true){
				int currentMilking = 0;
				while(timeline[time]){
					++time;
					++currentMilking;
				}
				
				if(currentMilking > longestMilking){
					longestMilking = currentMilking;
				}
				
				if(time >= lastEndTime){
					break;
				}
				
				int currentNoMilking = 0;
				while(!timeline[time]){
					++time;
					++currentNoMilking;
				}
				
				if(currentNoMilking > longestNoMilking){
					longestNoMilking = currentNoMilking;
				}
			}
			
			output.println(longestMilking + " " + longestNoMilking);
			
		}
		
		input.close();
		output.close();
	}

}
