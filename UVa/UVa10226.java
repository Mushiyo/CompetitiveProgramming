//TLE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class UVa10226 {
	private static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		
		public FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}
		
		public boolean hasNext() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = br.readLine();
					if (line == null) {
						return false;
					}
					st = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}	
			return true;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public String nextLine() {
			String ret = null;
			try {
				ret = br.readLine();
				
				if(ret == null){
					ret = "";
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			return ret;
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> plantRecord = new HashMap<String, Integer>();
		Set<String> plantTypes = new TreeSet<String>();
		Iterator<String> it;
		FastScanner input = new FastScanner(System.in);
		//Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			input.nextLine(); // eat the first empty line 

			while (n > 0) {
				plantRecord.clear();
				plantTypes.clear();
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
				
				it = plantTypes.iterator();
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
