import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int Exit_Procedure = 6;
	private static final int Search_Procedure = 5;
	private static final int Update_Procedure = 4;
	private static final int Edit_customerPoints = 4;
	private static final int TopProductsreturn = 4;
	private static final int topVendorReturn = 5;
	private static final int Delete_Outlet = 3;
	private static final int View_OutletList = 2;
	private static final int Add_Outlet = 1;
	private static final int View_CustomerList = 2;
	private static final int Delete_Customer = 3;
	private static final int Exit_Customer = 4;
	private static final int Add_Customer = 1;
	private static final int Exit_Product = 6;
	private static final int Delete_Product = 3;
	private static final int View_ProductList = 2;
	private static final int Add_Product = 1;
	private static final int Delete_Procedure = 3;
	private static final int View_ProcedureList = 2;
	private static final int Add_Procedure = 1;
	private static final int Archive_Transaction = 3;
	private static final int View_TransactionList = 2;
	private static final int Add_Transaction = 1;
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
		ArrayList<Outlet> outletList = new ArrayList<Outlet>();

		procedureList.add(new Procedure("Return", "06/08/2020", 01, "return products"));
		procedureList.add(new Procedure("Exchange", "07/08/2020", 02, "exchange products"));
		customerList.add(new customer("Mike", 12345678, 1000));
		productList.add(new product(900, "Apple", "-", "Fruit", "AppleLife", 2.0, 8));
		transactionList.add(new Transaction("Mike", "26/8/2020", "Joe", 555, 12345678, 900));
	

		
		int option = 0;
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == Transaction_option) { // Benedict
				option = 0;
				while (option != 5) {
					C206_CaseStudy.transactionMenu();
					option = Helper.readInt("Enter option > ");
					if (option == Add_Transaction) {
						// Add Transaction
						Transaction t = inputTransaction();
						C206_CaseStudy.addTransaction(transactionList, t);

					} else if (option == View_TransactionList) {
						C206_CaseStudy.viewTransactionList(transactionList,customerList, productList);
					} else if (option == Archive_Transaction) {
						C206_CaseStudy.archiveTransaction(transactionList);
					}
					else if (option == 4) {
						C206_CaseStudy.updateTransaction(transactionList, customerList, productList);
					}
					else if (option == 5 ) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid Option.");
					}
				}
			} else if (option == Procedure_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.procedureMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == Add_Procedure) {
						Procedure p = inputProcedure();
						C206_CaseStudy.addProcedure(procedureList, p);

					} else if (option == View_ProcedureList) {
						C206_CaseStudy.viewProcedureList(procedureList);

					} else if (option == Delete_Procedure) {
						C206_CaseStudy.delProcedure(procedureList);
					} 
					else if (option == Update_Procedure) {
						C206_CaseStudy.updateProcedure(procedureList);
					}
					else if (option == Search_Procedure) {
						C206_CaseStudy.searchProcedure(procedureList);
					}
					else if (option == Exit_Procedure) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");

					}
				}
				
			} else if (option == Product_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.productMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == Add_Product) {
						product pp = inputProuduct();
						C206_CaseStudy.addProduct(productList, pp);
					} else if (option == View_ProductList) {
						C206_CaseStudy.viewProductList(productList);

					} else if (option == Delete_Product) {
						C206_CaseStudy.deleteProduct(productList);
						
					} else if (option == TopProductsreturn) {
						C206_CaseStudy.TopProductsreturn(productList);
						
					} else if (option == topVendorReturn) {
						C206_CaseStudy.topVendorReturn(productList);
						
					} else if (option == Exit_Product) {
						System.out.println("Bye!");
						} else {
							System.out.println("Invalid Option.");
				}
			}
				
			} else if (option == Outlet_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.outletMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == Add_Outlet) {
						Outlet ou = C206_CaseStudy.inputOutlet();
						C206_CaseStudy.addOutlet(outletList, ou);
					} else if (option == View_OutletList) {
						C206_CaseStudy.viewOutlet(outletList);
					} else if (option == Delete_Outlet) {
						C206_CaseStudy.deleteOutlet(outletList);
					}
					else if (option == 4 ) {
						C206_CaseStudy.Updatestaffperoutlet(outletList);
					}
					else if (option == 5) {
						C206_CaseStudy.topreturnsperoutlet(outletList);
					}
					else if (option == 6) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid Option.");
					}
				}
			} else if (option == Customer_Option) { // Rupen
				option = 0;
				while (option != 5) {
					C206_CaseStudy.customerMenu();
					option = Helper.readInt("Enter an option > ");

					if (option == Add_Customer) {
						// Add items

						customer c = inputCustomer();
						C206_CaseStudy.addCustomer(customerList, c);

					} else if (option == View_CustomerList) {
						C206_CaseStudy.viewCustomerList(customerList);
					}

					else if (option == Delete_Customer) {
						C206_CaseStudy.deleteCustomer(customerList);
					} else if (option == Edit_customerPoints) {
						C206_CaseStudy.editpoints(customerList);
					} else if (option == Exit_Customer) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");
					}

				}
			} else if (option == Exit_Option) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option.");
			}
		}
	}

	// Menu
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

	// Transaction Menu
	public static void transactionMenu() {
		C206_CaseStudy.setHeader("Transaction List");
		System.out.println("1. Add Transaction");
		System.out.println("2. View Transaction");
		System.out.println("3. Archive Transaction");
		System.out.println("4. Update Transaction");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}

	// Procedure Menu
	public static void procedureMenu() {
		C206_CaseStudy.setHeader("Procedure List");
		System.out.println("1. Add Procedure");
		System.out.println("2. View Procedure");
		System.out.println("3. Delete Procedure");
		System.out.println("4. Update Procedure Date");
		System.out.println("5. Search A Procedure");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	// Product
	public static void productMenu() {
		C206_CaseStudy.setHeader("Product List");
		System.out.println("1. Add Product");
		System.out.println("2. View Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Top product return");
		System.out.println("5. Top vendor return");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	// Outlet
	public static void outletMenu() {
		C206_CaseStudy.setHeader("Outlet List");
		System.out.println("1. Add Outlet");
		System.out.println("2. View Outlet");
		System.out.println("3. Delete Outlet");
		System.out.println("4. Update Staff");
		System.out.println("5. Top return");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	// Customer Menu
	public static void customerMenu() {
		C206_CaseStudy.setHeader("Customer List");
		System.out.println("1. Add new customer");
		System.out.println("2. View all customer");
		System.out.println("3. Delete details");
		System.out.println("4. Edit points");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	// Transaction Done by Benedict
	public static String retrieveTransactionList(ArrayList<Transaction> transactionList , ArrayList<customer> customerList, ArrayList<product> productList) {
		String output = "";
		int cu = 0;
		int pp = 0;
		for (int i = 0; i < transactionList.size(); i++) {
			output += String.format("%d %-25s %-25s %-25s %-25d  ", (i + 1), transactionList.get(i).getCusName(),
					transactionList.get(i).getDate(), transactionList.get(i).getStaffName(),
					transactionList.get(i).getTransactionID());
			if (transactionList.get(i).getPhoneNumber() == customerList.get(cu).getNumber()) {
				output += String.format("%-25d ", customerList.get(cu).getPoints());
			}
			else {
				cu += 1;
			}
			
			if (transactionList.get(i).getProductID() == productList.get(pp).getProductID()) {
				output += String.format("%-25s \n", productList.get(pp).getDescription());
			}
			else {
				pp += 1;
			}
		}
		return output;
	}

	
	//View Transaction Done by Benedict
	public static void viewTransactionList(ArrayList<Transaction> transactionList, ArrayList<customer> customerList, ArrayList<product> productList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%s %-25s %-25s %-25s %-25s %-25s %-25s \n", "No.", "Customer Name", "Date", "Staff Name",
				"ID", "Customer Points", "Product Description");
		output += retrieveTransactionList(transactionList, customerList, productList);
		System.out.println(output);
	}

	// Add Transaction Done by Benedict
	public static Transaction inputTransaction() {
		String CN = Helper.readString("Enter Customer Name > ");
		String date = Helper.readString("Enter date > ");
		String SN = Helper.readString("Enter Staff Name > ");
		int tID = Helper.readInt("Enter Transaction ID > ");
		int pN = Helper.readInt("Enter customer phone number >");
		int PID = Helper.readInt("Enter product ID > ");

		Transaction tr = new Transaction(CN, date, SN, tID, pN, PID);
		return tr;
		

	}

	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction tr) {

		transactionList.add(tr);
		System.out.println("Transaction added");
	}

	// Archive Transaction Done by Benedict
	public static void archiveTransaction(ArrayList<Transaction> transactionList) {
		int ID = Helper.readInt("Enter Transaction ID > ");
		int pos = -1;
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
		for (int i = 0; i < transactionList.size(); i++) {
			if (ID == transactionList.get(i).getTransactionID()) {
				pos = i;

			}
		}
		String confirmation = Helper.readString("Confirm archive? (Yes/No) >");
		if (confirmation.equalsIgnoreCase("Yes")) {
			archiveList.add(new Transaction(transactionList.get(pos).getCusName(), transactionList.get(pos).getDate(),
					transactionList.get(pos).getStaffName(), transactionList.get(pos).getTransactionID(), transactionList.get(pos).getPhoneNumber(),transactionList.get(pos).getProductID()));
			transactionList.remove(pos);
			System.out.println("Successfully archived.");
		}
	}
	//Update Transaction Done by Benedict
	public static void updateTransaction (ArrayList<Transaction> transactionList, ArrayList<customer> customerList, ArrayList<product> productList) {
		int transactionID = Helper.readInt("Enter transaction ID to update > ");
		String output = String.format("%-25s %-25s %-25s %-25s \n", "Customer Name", "Date", "Staff Name", "ID");
		int cusPoints = Helper.readInt("Enter number of points to add to customer > ");
		String description = Helper.readString("Enter description to be change for product > ");
		int check = -1;
		int cu = 0;
		int pp = 0;
		for (int i = 0; i < transactionList.size(); i++) {
			if (transactionID == transactionList.get(i).getTransactionID()) {
				output += String.format("%-25s %-25s %-25s %-25d", transactionList.get(i).getCusName(),
						transactionList.get(i).getDate(), transactionList.get(i).getStaffName(),
						transactionList.get(i).getTransactionID());
				if (transactionList.get(i).getPhoneNumber() == customerList.get(cu).getNumber()) {
					customerList.get(cu).setPoints(customerList.get(cu).getPoints()+cusPoints);
					System.out.println(customerList.get(cu).getName() + " points has been changed to " + customerList.get(cu).getPoints());
				}
				else {
					cu += 1;
				}
				if (transactionList.get(i).getProductID() == productList.get(pp).getProductID()) {
					productList.get(pp).setDescription(description);
					System.out.println(productList.get(pp).getProductName() + " description has been changed to " + productList.get(pp).getDescription());
				}
				else {
					pp += 1;
				}
				check = 1;
				break;
			}
		}
		if (check == 1) {
			System.out.println(output);
		}
		else {
			System.out.println("Invalid Transaction ID");
		}
		
	}

	// Procedure (Done by Daryl)
	public static String retrieveProcedureList(ArrayList<Procedure> procedureList) {
		String output = "";
		for (int i = 0; i < procedureList.size(); i++) {
			output += String.format("%-10d %-20s %-20d %-20s %-20s \n", (i + 1), procedureList.get(i).getProcedure(), procedureList.get(i).getProcedureID(), procedureList.get(i).getDescription(),procedureList.get(i).getDate());
		}
		return output;
	}

	public static void viewProcedureList(ArrayList<Procedure> procedureList) {
		C206_CaseStudy.setHeader("PROCEDURE LIST");
		String output = String.format("%-10s %-20s %-20s %-20s %-20s \n", "No.", "Procedure", "Procedure ID", "Description", "Date");
		output += retrieveProcedureList(procedureList);
		System.out.println(output);
	}

	// Add Procedure Done by Daryl
	public static Procedure inputProcedure() {
		String p = Helper.readString("Enter new procedure >  ");
		String date = Helper.readString("Enter date created (DD/MM/YYYY) > ");
		int procID = Helper.readInt("Enter Procedure ID > ");
		String description = Helper.readString("Enter description > ");

		Procedure pr = new Procedure(p, date, procID, description);
		return pr;

	}

	public static void addProcedure(ArrayList<Procedure> procedureList, Procedure p) {

		procedureList.add(p);
		System.out.println("Procedure added");
	}

	// Delete Procedure Done by Daryl
	public static void delProcedure(ArrayList<Procedure> procedureList) {
		int procedure = Helper.readInt("Enter procedure ID > ");
		int pos = -1;
		for (int i = 0; i < procedureList.size(); i++) {
			if (procedure == procedureList.get(i).getProcedureID()) {
				pos = i;
			}
		}
		String confirmation = Helper.readString("Confirm Delete (Yes/No) >");
		if (confirmation.equalsIgnoreCase("Yes")) {
			procedureList.remove(pos);
		}
	}
	
	//Update Procedure date by Daryl
	public static void updateProcedure(ArrayList<Procedure> procedureList) {
		String name = Helper.readString("Enter procedure name to update date > ");
		
		for (int i = 0; i < procedureList.size(); i++) {
			if (name.equalsIgnoreCase(procedureList.get(i).getProcedure())) {
				String newDate = Helper.readString("Enter new date > ");
				procedureList.get(i).setDate(newDate);
				System.out.println(procedureList.get(i).getProcedure() + " date has been changed to " + newDate);
				break;
			}
			else {
				System.out.println("Invalid procedure");
			}
		}
	}
	// Search A procedure by Daryl
	public static void searchProcedure(ArrayList<Procedure> procedureList) {
		String procedure = Helper.readString("Enter procedure to find > ");
		String output = String.format("%-20s %-20s %-20s %-20s \n", "Procedure", "Procedure ID", "Description", "Date");
		for (int i = 0; i < procedureList.size(); i++ ) {
			if (procedure.equalsIgnoreCase(procedureList.get(i).getProcedure())) {
				output += String.format("%-20s %-20d %-20s %-20s", procedureList.get(i).getProcedure(), procedureList.get(i).getProcedureID(), procedureList.get(i).getDescription(),procedureList.get(i).getDate());
				System.out.println(output);
				break;
			}
			else {
				System.out.println("Invalid procedure");
			}
		}
	}
	
	// Product (Done by Boon Ying)
		public static String retrieveProductList(ArrayList<product> productList) {
			String output = " ";
			for (int i = 0; i < productList.size(); i++) {
				output += String.format("%d %-20d %-20s %-20s %-20s %-20s $%-20.2f %-20d \n", (i + 1), productList.get(i).getProductID(),
						productList.get(i).getProductName(), productList.get(i).getDescription(), productList.get(i).getCategory(),
						productList.get(i).getvendor(), productList.get(i).getPrice(), productList.get(i).getVendorpoints());
			}
			return output;
		}

		public static void viewProductList(ArrayList<product> productList) {
			C206_CaseStudy.setHeader("PRODUCT LIST");
			String output = String.format("%s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "No.", "ID", "ProductName", "Description", 
					"Category", "Vendor", "Price", "Vendor Points");
			output += retrieveProductList(productList);
			System.out.println(output);
		}

		// add product (Done by boonying)
		public static product inputProuduct() {
			int ProductID = Helper.readInt("Enter new product ID > ");
			String productName = Helper.readString("Enter product > ");
			String description = Helper.readString("Enter description > ");
			String category = Helper.readString("Enter category (Food/Beauty) > ");
			String vendor = Helper.readString("Enter supplier name > ");
			double price = Helper.readDouble("Enter price > $");
			int vendorpoints = Helper.readInt("Enter points for vendor > ");

			product pp = new product(ProductID, productName, description, category, vendor, price, vendorpoints);
			return pp;
		}

		public static void addProduct(ArrayList<product> productList, product pp) {
			productList.add(pp);
			System.out.println("product added ");
		}

		// delete product (Done by boonying)
		public static void deleteProduct(ArrayList<product> productList) {
			int productpos = LocateProduct(productList);
			String deleteproduct = Helper.readString("Do you want to delete this product information? > ");
			if (deleteproduct.equalsIgnoreCase("Yes")) {
				productList.remove(productpos);
				System.out.println("Product information has been removed");
			}
			else {
				System.out.println("Invalid product ID");
			}
		}

		public static int LocateProduct(ArrayList<product> productList) {
			int ProductID = Helper.readInt("Enter product ID > ");
			int productpos = -1;
			for (int i = 0; i < productList.size(); i++) {
				if (ProductID == productList.get(i).getProductID()) {
					productpos = i;
				}
			}
			return productpos;
		}
		
		// return product (done by boonying)
		public static void returnProduct(ArrayList<product> productList) {
			int returnproduct = Helper.readInt("Enter the product ID to return > ");
			int pro = 0;
			for (int i = 0; i < productList.size(); i++) {
				if(returnproduct == productList.get(i).getProductID()) {
					productList.get(i).setPrice(productList.get(i).getPrice()+1);
					pro = 1;
				}
			}
			if (pro == 1) {
				System.out.println("Product return successfully");
			}
			else {
				System.out.println("Invalid product");
			}
		}
		
		// top product return - (done by boonying)
		public static void TopProductsreturn(ArrayList<product> productList) {
			C206_CaseStudy.returnProduct(productList);
			double topReturn = 0;
			String productname  = "";
			for (int i = 0; i<productList.size(); i++) {
				if (topReturn < productList.get(i).getPrice()) {
					topReturn = productList.get(i).getPrice();
					productname = productList.get(i).getDescription();
				}
				System.out.println("Top product return: " + productname);
				
			}
		}
		
		// return vendor - (done by boonying)
		public static void returnVendor(ArrayList<product> productList) {
		    String returnVendor = Helper.readString("Enter vendor to return > ");
		    int ven = 0;
		    for (int i = 0; i < productList.size(); i++ ) {
		      if (returnVendor.equalsIgnoreCase(productList.get(i).getvendor())){
		        productList.get(i).setVendorpoints(productList.get(i).getVendorpoints()+1);
		        ven = 1;
		      }
		    }
		    if (ven == 1) {
		      System.out.println("Vendor return successfully");
		    }
		    else {
		      System.out.println("Invalid vendor");
		    }
		  }
		
		// top vendor return - (done by boonying)
		  public static void topVendorReturn(ArrayList<product> productList) {
			  C206_CaseStudy.returnVendor(productList);
		        int highestpoints = 0;
		        String vendorName = "";
		        for (int i = 0; i<productList.size(); i++) {
		          if (highestpoints < productList.get(i).getVendorpoints()) {
		            highestpoints = productList.get(i).getVendorpoints();
		            vendorName = productList.get(i).getvendor();
		          }
		      } System.out.println("Top vendor return is: "+ vendorName);
		   }


	// Customer (Done by Rupen)
	public static String retrieveCustomerList(ArrayList<customer> customerList) { // rupen
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%d %-10s %-20d  %-20d \n", (i + 1), customerList.get(i).getName(),
					customerList.get(i).getNumber(), customerList.get(i).getPoints());

		}

		return output;
	}

	public static void viewCustomerList(ArrayList<customer> customerList) { //rupen
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format("%s %-10s %-20s  %-10s\n", "No.", "Name", "Phone number", "Reward points");
		output += retrieveCustomerList(customerList);
		System.out.println(output);

	}

	// Add customer
	public static customer inputCustomer() { // rupen
		String name = Helper.readString("Enter name> ");
		int number = Helper.readInt("Enter phone number> ");
		int points = Helper.readInt("Enter points> ");

		customer cc = new customer(name, number, points);
		return cc;

	}

	public static void addCustomer(ArrayList<customer> customerList, customer c) { //rupen

		customerList.add(c);
		System.out.println("Customer added");
	}

	// Delete Customer (Done by Rupen)
	public static void deleteCustomer(ArrayList<customer> customerList) { //rupen
		// rupen
		int customerpos = LocateCustomer(customerList);
		String deletecustomer = Helper.readString("Do you want to delete this customer information? > ");
		if (deletecustomer.equalsIgnoreCase("Yes")) {
			customerList.remove(customerpos);
			System.out.println("Customer information has been removed");
		}
	}

	public static int LocateCustomer(ArrayList<customer> customerList) { //rupen
		String name = Helper.readString("Enter name> ");
		int customerpos = -1;
		for (int i = 0; i < customerList.size(); i++) {
			if (name.equalsIgnoreCase(customerList.get(i).getName())) {
				customerpos = i;
			}
		}
		return customerpos;
	}

	public static void editpoints(ArrayList<customer> customerList) {// rupen
		int customerpos = LocateCustomer(customerList);
		int edit_points = Helper.readInt("What is the updated points? >");
		customerList.get(customerpos).setPoints(edit_points);
		String output = String.format("%s %-10s %-20s  %-10s\n", "No.", "Name", "Phone number", "Reward points");
		output += retrieveCustomerList(customerList);
		System.out.println(output);

	}
	//

	// Outlet (Done by Yufan)
	public static String retrieveAllOutlet(ArrayList<Outlet> outletList) { //Yufan
		String output = "";
		for (int i = 0; i < outletList.size(); i++) {
			output += String.format("%-25d %-25d %-25s \n", outletList.get(i).getOutlet_id(),
					outletList.get(i).getNumber_of_staff(), outletList.get(i).getLocation());
		}
		return output;
	}

	public static void viewOutlet(ArrayList<Outlet> outletList) { //Yufan
		String output = String.format("%-25s %-25s %-25s \n", "OUTLET ID", "NUMBER OF STAFF", "LOCATION");
		output += retrieveAllOutlet(outletList);
		System.out.println(output);
	}

	// Add Outlet (Done by: Yufan)
	public static Outlet inputOutlet() { //Yufan

		String location = Helper.readString("Enter location: ");
		int outlet_id = Helper.readInt("Enter outlet_id: ");
		int number_of_staff = Helper.readInt("Enter Number of staff: ");
		int number_of_returns = Helper.readInt("Enter number of returns: ");

		Outlet ou = new Outlet(location, outlet_id, number_of_staff, number_of_returns);
		return ou;
	}

	public static void addOutlet(ArrayList<Outlet> outletList, Outlet ou) { //Yufan
		outletList.add(ou);
		System.out.println("Outlet added ");
	}

	// Delete Outlet (Done by: Yufan)
	public static void deleteOutlet(ArrayList<Outlet> outletList) { //Yufan
		int outpos = LocateOutlet(outletList);
		String yesorno = Helper.readString("You sure u want to delete this outlet? (Yes/No)>");
		if (yesorno.equalsIgnoreCase("Yes")) {
			outletList.remove(outpos);
			System.out.println("Outlet has been remove");
		}
	}

	public static int LocateOutlet(ArrayList<Outlet> outletList) { //Yufan

		int outlet_id = Helper.readInt("Enter outlet_id: ");
		int outpos=-1;
		for(int i=0;i<outletList.size();i++) {
			if(outlet_id==outletList.get(i).getOutlet_id()) {
				outpos=i;
			}
			}
		return outpos;
	}
	//update staff per staff per outlet (Yufan)
	  public static void Updatestaffperoutlet(ArrayList<Outlet> outletList) {
	    boolean outletexist=false;
	    int outletpos=-1;
	    int outletid=Helper.readInt("Enter outlet ID to be updated: ");
	    while(outletexist==false) {
	    for(int i=0;i<outletList.size(); i++) {
	      if(outletid == outletList.get(i).getOutlet_id()) {
	        outletexist=true;
	        outletpos=i;
	        break;
	      }
	    if(outletexist) {
	      System.out.println("This outlet ID does not exist try agina");
	      outletid=Helper.readInt("Enter outlet ID to be updated: ");
	    }else {
	      outletexist=false;
	    }
	    }
	    }
	    int number_of_staff = Helper.readInt("Enter number of staff to be updated: ");
	    outletList.get(outletpos).setNumber_of_staff(number_of_staff);
	    System.out.println("Outlet staff updated");
	  }
	  
	  //top returns per outlet (Yufan)
	  
	  public static void topreturnsperoutlet (ArrayList<Outlet> outletList) {
	    int Highestreturn = outletList.get(0).getNumber_of_return();
	    int Highestoutletpos = 0; 
	    for (int i = 0; i<outletList.size(); i++) { 
	      if ( Highestreturn < outletList.get(i).getNumber_of_return()) {
	        Highestreturn = outletList.get(i).getNumber_of_return();
	        Highestoutletpos = i; 
	      }
	    }
	    
	    System.out.println ("Outlet which has the highest return " + outletList.get(Highestoutletpos).getOutlet_id() + " located at " + outletList.get(Highestoutletpos).getLocation());
	  }



	// Header
	public static void setHeader(String header) {
		Helper.line(80, "-");	
		System.out.println(header);
		Helper.line(80, "-");

	}

}
