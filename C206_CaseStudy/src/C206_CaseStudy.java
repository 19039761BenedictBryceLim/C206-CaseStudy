import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int Exit_Option = 6;
	private static final int Customer_Option = 5;
	private static final int Outlet_Option = 4;
	private static final int Product_Option = 3;
	private static final int Procedure_Option = 2;
	private static final int Transaction_option = 1;

	public static void main(String[] args) {

		ArrayList<customer> customerList = new ArrayList<customer>();
		ArrayList<Procedure> procedureList = new ArrayList<Procedure>();
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<product> productList = new ArrayList<product>();
		
		
		int option = 0;
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == Transaction_option) {
				
			}
			else if (option == Procedure_Option) {
				
			}
			else if (option == Product_Option) {
				
			}
			else if (option == Outlet_Option) {
				
			}
			else if (option == Customer_Option) {
				option = 0;
				while (option != 4) {
					C206_CaseStudy.customerMenu();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// Add items
						String name = Helper.readString("Enter name> ");
						int number = Helper.readInt("Enter phone number> ");

						int points = Helper.readInt("Enter points> ");

						customerList.add(new customer(name, number, points));

					} 
					else if (option == 2) {
						C206_CaseStudy.viewAll(customerList);
					}

					else if (option == 3) {
						String name = Helper.readString("Enter name> ");
						for (int i = 0; i < customerList.size(); i++) {
							if(name.charAt(i) == customerList.get(i).getName().charAt(i)) {
								customerList.remove(i).getName();
							}
							else {
								System.out.println("Does not exist");
							}
						}
					} else if (option == 4) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");
					}

				}
			}
			else if (option == Exit_Option) {
				System.out.println("Bye!");
			}
			else {
				System.out.println("Invalid option.");
			}
		}
}
	public static void menu() {
		C206_CaseStudy.setHeader("Select option");
		System.out.println("1. Transaction");
		System.out.println("2. Procedure");
		System.out.println("3. Product");
		System.out.println("4. Outlet");
		System.out.println("5. Customer");
		System.out.println("6. Exit");
	}

	public static void customerMenu() {
		C206_CaseStudy.setHeader("Customer List");
		System.out.println("1. Add new customer");
		System.out.println("2. View all customer");
		System.out.println("3. Delete details");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String retrieveAll(ArrayList<customer> customerList) {
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%d %-10s %-20d  %-20d\n", (i + 1), customerList.get(i).getName(),
					customerList.get(i).getNumber(), customerList.get(i).getPoints());

		}

		return output;
	}

	public static void viewAll(ArrayList<customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format("%s %-10s %-20s  %10s\n", "No.", "Name", "Phone number", "Reward points");
		output += retrieveAll(customerList);
		System.out.println(output);

	}

}
