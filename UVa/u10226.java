import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class u10226 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			input.nextLine(); // eat change line
			input.nextLine(); // eat the first empty line 

			while (n > 0) {
				Map<String, Integer> plantRecord = new HashMap<String, Integer>();
				Set<String> plantTypes = new TreeSet<String>();
				int countPlant = 0;
				
				while (true && input.hasNext()) {
					String plantName = input.nextLine();

					if (plantName.equals("")) {
						break;
					}
					
					plantTypes.add(plantName);
					if(plantRecord.containsKey(plantName)){
						int apperTimes = plantRecord.get(plantName);
						++apperTimes;
						plantRecord.put(plantName, apperTimes);
					}
					else{
						plantRecord.put(plantName, 1);
					}
					
					++countPlant;
				}
				
				Iterator<String> it = plantTypes.iterator();
				while(it.hasNext()){
					String plantName = it.next();
					double appearTimes =plantRecord.get(plantName); 
					
					System.out.printf("%s %.4f\n", plantName, (appearTimes * 100) / countPlant);
				}
				

				if (n > 1) {
					System.out.println();
				}

				--n;
			}
		}
	}

}
