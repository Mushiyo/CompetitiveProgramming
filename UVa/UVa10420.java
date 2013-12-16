import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class UVa10420 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			Map<String, Integer> conquerList = new TreeMap<String, Integer>();
			
			input.nextLine();// eat change line
			
			while(n > 0){
				String country = input.next();
				String name = input.nextLine();
				
				if(conquerList.containsKey(country)){
					int numOfPeople = conquerList.get(country);
					++numOfPeople;
					conquerList.put(country, numOfPeople);
				}
				else{
					conquerList.put(country, 1);
				}
				
				--n;
			}
			
			for(Map.Entry<String, Integer> record: conquerList.entrySet()){
				String country = record.getKey();
				int numOfPeople = record.getValue();
				
				System.out.println(country + " " + numOfPeople);
			}
		}
	}

}
