/*
ID: mushiyo1
LANG: JAVA
TASK: namenum
*/
import java.util.*;
import java.io.*;

public class namenum {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("namenum.in"));
		Scanner dictFile = new Scanner(new File("dict.txt"));
		PrintWriter output = new PrintWriter(new File("namenum.out"));
		
		int[] charVal = new int[26];
		int assignVal = 6;
		for(int i = 0; i < charVal.length; ++i){
			if((char)(i + 'A') == 'Q' || (char)(i + 'A') == 'Z'){
				continue;
			}
			charVal[i] = assignVal / 3;
			++assignVal;
		}
		
		//set up dictionary
		Map<String, TreeSet<String>> dict = new HashMap<String, TreeSet<String>>();
		while(dictFile.hasNext()){
			String name = dictFile.next();
			String nameVal = getNameVal(name, charVal);
			if(dict.containsKey(nameVal)){
				TreeSet<String> nameSet = dict.get(nameVal);
				nameSet.add(name);
				dict.put(nameVal, nameSet);
			}
			else{
				TreeSet<String> nameSet = new TreeSet<String>();
				nameSet.add(name);
				dict.put(nameVal, nameSet);
			}
		}
		
		while(input.hasNext()){
			String serialNum = input.next();
			
			if(dict.containsKey(serialNum)){
				TreeSet<String> nameSetOfSerial = dict.get(serialNum);
				Iterator<String> it = nameSetOfSerial.iterator();
				while(it.hasNext()){
					output.println(it.next());
				}
			}
			else{
				output.println("NONE");
			}
		}
		
		input.close();
		output.close();
	}
	
	public static String getNameVal(String name, int[] charVal){
		StringBuilder val = new StringBuilder();
		
		for(int i = 0; i < name.length(); ++i){
			val.append(charVal[name.charAt(i) - 'A']);
		}
		
		return val.toString();
	}

}
