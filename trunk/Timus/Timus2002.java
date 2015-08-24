/* Filename: Timus2002.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class Timus2002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			HashMap<String, String> registeredUser = new HashMap<String, String>();
			HashSet<String> loginUser = new HashSet<String>();
			
			while(n > 0){
				String operation = input.next();
				String username = input.next();
				
				if(operation.equals("register")){
					String password = input.next();
					
					if (registeredUser.containsKey(username)){
						System.out.println("fail: user already exists");
					} else {
						registeredUser.put(username, password);
						System.out.println("success: new user added");
					}
				} else if(operation.equals("login")){
					String password = input.next();
					if (!registeredUser.containsKey(username)){
						System.out.println("fail: no such user");
					} else if(!registeredUser.get(username).equals(password)){
						System.out.println("fail: incorrect password");
					} else if(loginUser.contains(username)){
						System.out.println("fail: already logged in");
					} else{
						loginUser.add(username);
						System.out.println("success: user logged in");
					}
				} else if (operation.equals("logout")){
					if (!registeredUser.containsKey(username)){
						System.out.println("fail: no such user");
					} else if(!loginUser.contains(username)){
						System.out.println("fail: already logged out");
					} else{
						loginUser.remove(username);
						System.out.println("success: user logged out");
					}
				}
				
				--n;
			}
		}
	}

}
