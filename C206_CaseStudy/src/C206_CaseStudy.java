import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int Delete_Outlet = 3;
	private static final int View_OutletList = 2;
	private static final int Add_Outlet = 1;
	private static final int View_CustomerList = 2;
	private static final int Delete_Customer = 3;
	private static final int Exit_Customer = 4;
	private static final int Add_Customer = 1;
	private static final int Exit_Product = 4;
	private static final int Delete_Product = 3;
	private static final int View_ProductList = 2;
	private static final int Add_Product = 1;
	private static final int Exit_Procedure = 4;
	private static final int Delete_Procedure = 3;
	private static final int View_ProcedureList = 2;
	private static final int Add_Procedure = 1;
	private static final int Archive_Transaction = 3;
	private static final int Exit_Transaction = 4;
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
		
		procedureList.add(new Procedure("Return", "06/08/2020", 01, "return products" ));
		procedureList.add(new Procedure("Exchange", "07/08/2020", 02, "exchange products"));
		
		int option = 0;
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == Transaction_option) { //Benedict
				option = 0;
				while (option != 5) {
					C206_CaseStudy.transactionMenu();
					option = Helper.readInt("Enter option > ");
					if (option == Add_Transaction) {
						//Add Transaction
						Transaction t = inputTransaction();
						C206_CaseStudy.addTransaction(transactionList, t);
						
					}
					else if (option == View_TransactionList) {
						C206_CaseStudy.viewTransactionList(transactionList);
					}
					else if (option == Archive_Transaction) {
						C206_CaseStudy.archiveTransaction(transactionList);
					}
					else if (option == Exit_Transaction) {
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
					if (option == Add_Procedure) {
						Procedure p = inputProcedure();
						C206_CaseStudy.addProcedure(procedureList, p);
						
					}
					else if (option == View_ProcedureList) {
						C206_CaseStudy.viewProcedureList(procedureList);
						
					}
					else if (option == Delete_Procedure) {
						C206_CaseStudy.delProcedure(procedureList);
					}else if (option == Exit_Procedure) {
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
					if (option == Add_Product) {
						product pp = inputProuduct();
						C206_CaseStudy.addProduct(productList, pp);
					}
					else if (option == View_ProductList) {
						C206_CaseStudy.viewProductList(productList);
						
					}
					else if (option == Delete_Product) {
						C206_CaseStudy.deleteProduct(productList);
					}
					else if (option == Exit_Product) {
						System.out.println("Bye!");
					}
					else {
						System.out.println("Invalid Option.");
					}
				}
			}
			else if (option == Outlet_Option) {
				option = 0;
				while (option != 5) {
					C206_CaseStudy.outletMenu();
					option = Helper.readInt("Enter an option > ");
					if (option == Add_Outlet) {
						Outlet ou = C206_CaseStudy.inputOutlet();
						C206_CaseStudy.addOutlet(outletList, ou);
					}
					else if (option == View_OutletList) {
						C206_CaseStudy.viewOutlet(outletList);
					}
					else if (option == Delete_Outlet) {
						C206_CaseStudy.deleteOutlet(outletList);
					} 
					else if (option == 4) {
						System.out.println("Bye!");
					}
					else {
						System.out.println("Invalid Option.");
					}
				}
			}
			else if (option == Customer_Option) { //Rupen
				option = 0;
				while (option != 5) {
					C206_CaseStudy.customerMenu();
					option = Helper.readInt("Enter an option > ");

					if (option == Add_Customer) {
						// Add items

						customer c = inputCustomer();
						C206_CaseStudy.addCustomer(customerList, c);

					} 
					else if (option == View_CustomerList) {
						C206_CaseStudy.viewCustomerList(customerList);
					}

					else if (option == Delete_Customer) {
						C206_CaseStudy.deleteCustomer(customerList);
					} else if (option == Exit_Customer) {
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
	//Outlet
	public static void outletMenu() {
		C206_CaseStudy.setHeader("Outlet List");
		System.out.println("1. Add Outlet");
		System.out.println("2. View Outlet");
		System.out.println("3. Delete Outlet");
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
			output += String.format("%d %-25s %-25s %-25s %-25d\n", (i+1), transactionList.get(i).getCusName(), transactionList.get(i).getDate(), transactionList.get(i).getStaffName(),transactionList.get(i).getTransactionID());
		}
		return output;
	}
	public static void viewTransactionList(ArrayList<Transaction> transactionList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%s %-25s %-25s %-25s %-25s \n","No.", "Customer Name", "Date", "Staff Name", "ID");
		output+= retrieveTransactionList(transactionList);
		System.out.println(output);
	}
	//Add Transaction
	public static Transaction inputTransaction() {
		String CN = Helper.readString("Enter Customer Name > ");
		String date = Helper.readString("Enter date > ");
		String SN = Helper.readString("Enter Staff Name > ");
		int tID = Helper.readInt("Enter Transaction ID > ");

		Transaction tr = new Transaction(CN, date, SN, tID);
		return tr;

	}
	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction t) {
		
		transactionList.add(t);
		System.out.println("Transaction added");
	}
	//Archive Transaction
	public static void archiveTransaction(ArrayList<Transaction>transactionList) {
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
			archiveList.add(new Transaction(transactionList.get(pos).getCusName(),transactionList.get(pos).getDate(),transactionList.get(pos).getStaffName(),transactionList.get(pos).getTransactionID()));
			transactionList.remove(pos);
			System.out.println("Successfully archived.");
		}
	}
	
	
	
	//Procedure (Done by Daryl)
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
	
	//Add Procedure Done by Daryl
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
	//Delete Procedure Done by Daryl
	public static void delProcedure(ArrayList<Procedure> procedureList) {
		int procedure = Helper.readInt("Enter procedure ID > ");
		int pos = -1;
		for (int i = 0; i < procedureList.size(); i++) {
			if (procedure==procedureList.get(i).getProcedureID()) {
				pos = i;
			}
			String confirmation = Helper.readString("Confirm Delete (Yes/No) >");
			if (confirmation.equalsIgnoreCase("Yes")) {
				procedureList.remove(pos);
			}
		}
	}
	
	
	
	//Product (Done by Boon Ying)
	public static String retrieveProductList (ArrayList<product> productList) {
		String output = " ";
		for (int i = 0; i < productList.size(); i++) {
			output += String.format("%d %-20d %-20s %-20s %-20s $%-20.2f", (i+1), productList.get(i).getProductID(), productList.get(i).getDescription(), productList.get(i).getCategory(), productList.get(i).getSupplierName(), productList.get(i).getPrice());
		}
		return output;
	}
	public static void viewProductList(ArrayList<product> productList) {
		C206_CaseStudy.setHeader("PRODUCT LisT");
		String output = String.format("%s %-20s", "No.", "ID", "Description", "Category", "Supplier Name", "Price");
		output += retrieveProductList(productList);
		System.out.println(output);
	}
	// add product (Done by boonying)
	  public static product inputProuduct() {
	    int ProductID = Helper.readInt("Enter new product ID > ");
	    String description = Helper.readString("Enter description > ");
	    String category = Helper.readString("Enter category (Food/Beauty) > ");
	    String Supplier = Helper.readString("Enter supplier name > ");
	    double price = Helper.readDouble("Enter price > $");
	    
	    product pp = new product(ProductID, description, category, Supplier, price);
	    return pp;
	  }
	  public static void addProduct(ArrayList<product>productList,product pp) {
	    productList.add(pp);
	    System.out.println("product added ");
	  }

	  // delete product (Done by boonying)
	  public static void deleteProduct(ArrayList<product>productList) {
	    int productpos = LocateProduct(productList);
	    String deleteproduct = Helper.readString("Do you want to delete this product information? > ");
	    if (deleteproduct.equalsIgnoreCase("Yes")) {
	      productList.remove(productpos);
	      System.out.println("Product information has been removed");
	    }
	  }
	public static int LocateProduct(ArrayList<product> productList) {
		int ProductID = Helper.readInt("Enter new product ID > ");
	    int productpos=-1;
	    for(int i=0;i<productList.size();i++) {
	      if(ProductID==productList.get(i).getProductID()) {
	        productpos=i;
	      }
	    }
		return productpos;
	}
	
	//Customer (Done by Rupen)
	public static String retrieveCustomerList(ArrayList<customer> customerList) {
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%d %-10s %-20d  %-20d \n", (i + 1), customerList.get(i).getName(),
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
	//Add customer
	public static customer inputCustomer() {
		String name = Helper.readString("Enter name> ");
		int number = Helper.readInt("Enter phone number> ");
		int points = Helper.readInt("Enter points> ");

		customer cc = new customer(name, number, points);
		return cc;

	}
	public static void addCustomer(ArrayList<customer> customerList, customer c) {

		customerList.add(c);
		System.out.println("Customer added");
	}
	//Delete Customer (Done by Rupen)
	public static void deleteCustomer(ArrayList<customer> customerList) {
		//rupen
		  int customerpos = LocateCustomer(customerList);
		  String deletecustomer = Helper.readString("Do you want to delete this customer information? > ");
		  if (deletecustomer.equalsIgnoreCase("Yes")) {
		   customerList.remove(customerpos);
		   System.out.println("Customer information has been removed");
		  }
		 }
	public static int LocateCustomer(ArrayList<customer> customerList) {
		String name = Helper.readString("Enter name> ");
		  int customerpos = -1;
		  for (int i = 0; i < customerList.size(); i++) {
		   if (name == customerList.get(i).getName()) {
		    customerpos = i;
		   }
		  }
		return customerpos;
	}
	
	
	//Outlet (Done by Yufan)
	public static String retrieveAllOutlet(ArrayList<Outlet> outletList) {
	    String output="";
	    for (int i = 0; i < outletList.size(); i++) {
	      output += String.format("%-25d %-25d %-25s \n", outletList.get(i).getOutlet_id(),
	          outletList.get(i).getNumber_of_staff(),outletList.get(i).getLocation());
	    }
	    return output;
	  }
	public static void viewOutlet(ArrayList<Outlet> outletList) {
	       String output = String.format("%-25s %-25s %-25s \n", "OUTLET ID", "NUMBER OF STAFF",
	        "LOCATION");
	     output += retrieveAllOutlet(outletList);  
	    System.out.println(output);
	}
	 //Add Outlet (Done by: Yufan)
	public static Outlet inputOutlet() {
			String location=Helper.readString("Enter location: ");
			int outlet_id = Helper.readInt("Enter outlet_id: ");
			int number_of_staff = Helper.readInt ("Enter Number of staff: ");
			
			Outlet ou=new Outlet(location, outlet_id, number_of_staff);
			return ou;
		}
	public static void addOutlet(ArrayList<Outlet>outletList,Outlet ou) {
			outletList.add(ou);
			System.out.println("Outlet added ");
		}
	//Delete Outlet (Done by: Yufan)
	public static void deleteOutlet(ArrayList<Outlet>outletList) {
<<<<<<< HEAD
		int outpos = LocateOutlet(outletList);
		String yesorno=Helper.readString("You sure u want to delete this outlet? (Yes/No)>");
		if (yesorno.equalsIgnoreCase("Yes")){
			outletList.remove(outpos);
			System.out.println("Outlet has been remove");
		}
	}
	public static int LocateOutlet(ArrayList<Outlet> outletList) {
=======
		int outpos = locateoutlet(outletList);
		String yesorno=Helper.readString("You sure u want to delete this outlet? (Yes/No)>");
		if (yesorno.equalsIgnoreCase("Yes")){
			outletList.remove(outpos);
			System.out.println("Outlet has been remove");
		}
	}
	public static int locateoutlet(ArrayList<Outlet> outletList) {
>>>>>>> branch 'master' of https://github.com/19039761BenedictBryceLim/T2-C206-CaseStudy.git
		int outlet_id = Helper.readInt("Enter outlet_id: ");
		int outpos=-1;
		for(int i=0;i<outletList.size();i++) {
			if(outlet_id==outletList.get(i).getOutlet_id()) {
				outpos=i;
			}
			}
		return outpos;
	}
	
	  //Header
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}

}
