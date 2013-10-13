package NPSC;

import java.util.Scanner;

public class b223 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			StringBuilder message = new StringBuilder(input.next());
			
			String cmd = input.next();
			while(!cmd.equals("END")){
				if(cmd.equals("ADD")){
					String appendStr = input.next();
					message = message.append(appendStr);
				}
				
				if(cmd.equals("ADH")){
					StringBuilder appendStr = new StringBuilder(input.next());
					message = appendStr.append(message);
				}
				
				if(cmd.equals("ERA")){
					int beginIndex = input.nextInt() - 1;
					int endIndex = input.nextInt();
					message = message.delete(beginIndex, endIndex);
				}
				
				if(cmd.equals("SUB")){
					int beginIndex = input.nextInt() - 1;
					int endIndex = input.nextInt();
					message = new StringBuilder(message.substring(beginIndex, endIndex));
				}
				
				if(cmd.equals("SPA")){
					int insertIndex = input.nextInt() - 1;
					message = message.insert(insertIndex, "_");
				}
				
				System.out.println(message);
				
				cmd = input.next();
			}
		}
	}

}
