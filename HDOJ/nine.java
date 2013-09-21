import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class nine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, String> var = new HashMap<String, String>();
		Map<String, String> constant = new HashMap<String, String>();

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int N = input.nextInt();
				input.nextLine(); // eat change line
				var.clear();
				constant.clear();
				boolean errOn = true;
				boolean isPanic = false;

				while (N > 0) {
					if (isPanic) {
						System.out.println(input.nextLine());
						--N;
						continue;
					}

					String cmd = input.next().trim();
					
					//System.out.println(cmd);

					if (cmd.equals("Errmsg")) {
						String state = input.next();

						if (state.equals("ON")) {
							errOn = true;
						} else {
							errOn = false;
						}
					} else if (cmd.equals("Print")) {
						String valName = input.next();

						if (valName.startsWith("$")) { // var
							String val = var.get(valName);

							if (val != null) { // var defined
								if (val.startsWith("\"")) { // string
									System.out.println(val.substring(1,
											val.length() - 1));
								} else { // int
									System.out.println(val);
								}
							} else { // var undefined
								System.out.println("NULL");

								if (errOn) {
									System.out
											.println("NOTICE: Undefined Variable "
													+ valName + ".");
								}
							}
						} else { // constant
							String val = constant.get(valName);

							if (val != null) { // const defined
								if (val.startsWith("\"")) { // string
									System.out.println(val.substring(1,
											val.length() - 1));
								} else { // int
									System.out.println(val);
								}
							} else { // const undefined
								System.out.println(valName);

								if (errOn) {
									System.out
											.println("NOTICE: Undefined Constant "
													+ valName + ".");
								}
							}
						}
					} else if (cmd.equals("Dump")) {
						String valName = input.next();

						if (valName.startsWith("$")) { // var
							String val = var.get(valName);

							if (val != null) { // var defined
								if (val.startsWith("\"")) { // string
									System.out.print("string: ");
								} else { // int
									System.out.print("integer: ");
								}

								System.out.println(val);
							} else { // var undefined
								System.out.println("NULL");

								if (errOn) {
									System.out
											.println("NOTICE: Undefined Variable "
													+ valName + ".");
								}
							}
						} else { // constant
							String val = constant.get(valName);

							if (val != null) { // constant defined
								if (val.startsWith("\"")) { // string
									System.out.print("string: ");
								} else { // int
									System.out.print("integer: ");
								}

								System.out.println(val);
							} else { // constant undefined
								val = "\"" + valName + "\"";
								constant.put(valName, val);

								System.out.println(val);

								if (errOn) {
									System.out
											.println("NOTICE: Undefined Constant "
													+ valName + ".");
								}
							}
						}
					} else if (cmd.equals("Panic")) {
						isPanic = true;
						System.out.println("Script was KILLED.");
						input.nextLine();
						
					}
					// Assignment
					else if (cmd.startsWith("$")) {
						input.next();
						String val = input.next();
						var.put(cmd, val);
					} else {
						input.next();
						String val = input.next();

						if (constant.get(cmd) != null) {
							if (errOn) {
								System.out.println("WARNING: Constant " + cmd
										+ " Already Defined!");
							}
						} else {
							constant.put(cmd, val);
						}
					}

					--N;
				}

				if (T > 1) {
					System.out.println();
				}

				--T;
			}
		}
	}

}
