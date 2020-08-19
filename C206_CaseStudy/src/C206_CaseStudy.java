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
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
		ArrayList<product> productList = new ArrayList<product>();
		
		procedureList.add(new Procedure("Return"));
		procedureList.add(new Procedure("Exchange"));
		
		int option = 0;
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == Transaction_option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.transactionMenu();
					option = Helper.readInt("Enter option > ");
					if (option == 1) {
						//Add Transaction
						int ID = Helper.readInt("Enter Transaction ID > ");
						transactionList.add(new Transaction(ID));
					}
					else if (option == 2) {
						C206_CaseStudy.viewTransactionList(transactionList);
					}
					else if (option == 3) {
						int ID = Helper.readInt("Enter Transaction ID > ");
						for (int i = 0; i < transactionList.size(); i++) {
							if (ID == transactionList.get(i).getTransactionID()) {
								archiveList.add(new Transaction(ID));
								transactionList.remove(i);
							}
							else {
								System.out.println("Does not exist.");
							}
						}
					}
					else if (option == 4) {
						System.out.println("Bye!");
					}
					else {
						System.out.println("Invalid Option.");
					}
				}
			}
			else if (option == Procedure_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.procedureMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == 1) {
						String procedure = Helper.readString("Enter new procedure > ");
						procedureList.add(new Procedure(procedure));
					}
					else if (option == 2) {
						C206_CaseStudy.viewProcedureList(procedureList);
						
					}
					else if (option == 3) {
						String procedure = Helper.readString("Enter procedure > ");
						for (int i = 0; i < procedureList.size(); i++) {
							if (procedure==procedureList.get(i).getProcedure()) {
								procedureList.remove(i).getProcedure();
							}
							else {
								System.out.println("Does not exist.");
							}
						}
					}else if (option == 4) {
						System.out.println("Bye!");
					}
					else {
						System.out.println("Invalid option");
					
					}
				}
			}
			else if (option == Product_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.productMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == 1) {
						int ProductID = Helper.readInt("Enter new product ID > ");
						String description = Helper.readString("Enter description > ");
						String category = Helper.readString("Enter category (Food/Beauty) > ");
						String Supplier = Helper.readString("Enter supplier name > ");
						productList.add(new product(ProductID, description, category, Supplier));
					}
					else if (option == 2) {
						C206_CaseStudy.viewProductList(productList);
						
					}
					else if (option == 3) {
						int ID = Helper.readInt("Enter product ID > ");
						for (int i = 0; i < productList.size(); i++) {
							if (ID == productList.get(i).getProductID()) {
								productList.remove(i);
							}
						}
					}
					else if (option == 4) {
						System.out.println("Bye!");
					}
					else {
						System.out.println("Invalid Option.");
					}
				}
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
						C206_CaseStudy.viewCustomerList(customerList);
					}

					else if (option == 3) {
						String name = Helper.readString("Enter name> ");
						for (int i = 0; i < customerList.size(); i++) {
							if(name==customerList.get(i).getName()) {
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
	//Menu
	public static void menu() {
		C206_CaseStudy.setHeader("Select option");
		System.out.println("1. Transaction");
		System.out.println("2. Procedure");
		System.out.println("3. Product");
		System.out.println("4. Outlet");
		System.out.println("5. Customer");
		System.out.println("6. Exit");
		Helper.line(80, "-");
	}
	//Transaction Menu
	public static void transactionMenu() {
		C206_CaseStudy.setHeader("Transaction List");
		System.out.println("1. Add Transaction");
		System.out.println("2. View Transaction");
		System.out.println("3. Archive Transaction");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	//Procedure Menu
	public static void procedureMenu() {
		C206_CaseStudy.setHeader("Procedure List");
		System.out.println("1. Add Procedure");
		System.out.println("2. View Procedure");
		System.out.println("3. Delete Procedure");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	//Product 
	public static void productMenu() {
		C206_CaseStudy.setHeader("Product List");
		System.out.println("1. Add Product");
		System.out.println("2. View Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	//Customer Menu
	public static void customerMenu() {
		C206_CaseStudy.setHeader("Customer List");
		System.out.println("1. Add new customer");
		System.out.println("2. View all customer");
		System.out.println("3. Delete details");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}


	//Transaction
	public static String retrieveTransactionList (ArrayList<Transaction> transactionList) {
		String output = "";
		for (int i = 0; i <transactionList.size(); i++) {
			output += String.format("%d %-10d\n", (i+1), transactionList.get(i).getTransactionID());
		}
		return output;
	}
	public static void viewTransactionList(ArrayList<Transaction> transactionList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%s %-10s \n","No.", "ID");
		output+= retrieveTransactionList(transactionList);
		System.out.println(output);
	}
	//Procedure
	public static String retrieveProcedureList (ArrayList<Procedure> procedureList) {
		String output = "";
		for (int i = 0; i < procedureList.size(); i++) {
			output += String.format("%d %-10s \n", (i+1), procedureList.get(i).getProcedure());
		}
		return output;
	}
	public static void viewProcedureList(ArrayList<Procedure> procedureList) {
		C206_CaseStudy.setHeader("PROCEDURE LIST");
		String output = String.format("%s %-10s \n", "No.", "ID");
		output += retrieveProcedureList(procedureList);
		System.out.println(output);
		}
	
	//Product
	public static String retrieveProductList (ArrayList<product> productList) {
		String output = " ";
		for (int i = 0; i < productList.size(); i++) {
			output += String.format("%d %-20d %-20s %-20s %-20s", (i+1), productList.get(i).getProductID(), productList.get(i).getDescription(), productList.get(i).getCategory(), productList.get(i).getSupplierName());
		}
		return output;
	}
	public static void viewProductList(ArrayList<product> productList) {
		C206_CaseStudy.setHeader("PRODUCT LisT");
		String output = String.format("%s %-20s", "No.", "ID");
		output += retrieveProductList(productList);
		System.out.println(output);
	}
	
	//Customer
	public static String retrieveCustomerList(ArrayList<customer> customerList) {
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%d %-10s %-20d  %-20d\n", (i + 1), customerList.get(i).getName(),
					customerList.get(i).getNumber(), customerList.get(i).getPoints());

		}

		return output;
	}
	public static void viewCustomerList(ArrayList<customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format("%s %-10s %-20s  %-10s\n", "No.", "Name", "Phone number", "Reward points");
		output += retrieveCustomerList(customerList);
		System.out.println(output);

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
