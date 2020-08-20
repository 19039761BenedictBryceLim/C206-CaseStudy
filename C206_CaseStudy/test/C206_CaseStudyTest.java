import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {


	private customer c1;
	private customer c2;

	private Procedure p1;
	private Procedure p2;
	
	private Transaction t1;
	private Transaction t2;
	
	private product pr1;
	private product pr2;
	
	private Outlet o1;
	private Outlet o2;
	
	ArrayList<customer> customerList;
	ArrayList<Procedure> procedureList;
	ArrayList<Transaction> transactionList; 
	ArrayList<Transaction> archiveList; 
	ArrayList<product> productList;
	ArrayList<Outlet> outletList;

	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		// prepare test data
		
				//name, number, points
				c1 = new customer("Martin", 12345678, 100);
				c2 = new customer("Arthur", 87654321, 150);
				
				customerList= new ArrayList<customer>();
				
				//ProcedureName
				p1 = new Procedure("Delete", "20/8/2020", 001, "Delete procedure");
				p2 = new Procedure("Return", "20/8/2020", 002, "Return procedure");
				
				procedureList= new ArrayList<Procedure>();
				
				//TransactionID
				t1 = new Transaction("Melvin", "20/8/2020", "Joe", 9100);
				t2 = new Transaction("John", "20/8/2020", "Joe", 9200);
				
				transactionList= new ArrayList<Transaction>();
				
				//productID, description, category, supplierName, price
		        pr1= new product(001, "cleanser", "beauty", "Marcus", 40);
		        pr2= new product(002, "toner", "beauty", "George", 30);
				
				productList= new ArrayList<product>();
				
				//location, outlet_id,number_of_staff
				o1= new Outlet("Raffles place", 01, 50);
				o2= new Outlet("Chinatown", 02, 40);
				
				outletList= new ArrayList<Outlet>();
				
	}
	
	//PROCEDURE TESTS - Daryl
	@Test 
	public void addProcedureTest() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Procedure arraylist to add to", procedureList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addProcedure(procedureList, p1);		
		assertEquals("Test if that Procedure arraylist size is 1?", 1, procedureList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Procedure is added same as 1st item of the list?", p1, procedureList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addProcedure(procedureList, p2);
		assertEquals("Test that Procedure arraylist size is 2?", 2, procedureList.size());
	
	}
	@Test
	public void viewProcedureTest() {
		// Test if Item list is not null but empty, so that can add a new item
		  assertNotNull("Test if there is valid Procedure arraylist to add to", procedureList);

		  // test if the list of customers retrieved from the SourceCentre is empty
		  String allProcedure= C206_CaseStudy.retrieveProcedureList(procedureList); 
		  String Output = "";
		  assertEquals("Check that ViewAllProcedureList", Output, allProcedure);

		  // Given an empty list, after adding 2 items, test if the size of the list is 2
		  C206_CaseStudy.addProcedure(procedureList, p1);
		  C206_CaseStudy.addProcedure(procedureList, p2);
		  assertEquals("Test if Procedure ArrayList size is 2?", 2, procedureList.size());

		  allProcedure = C206_CaseStudy.retrieveProcedureList(procedureList); 

		  Output = String.format("%-20s %-20s %-20d %-20s \n", "Delete", "20/8/2020", 021, "Delete procedure");
		  Output += String.format("%-20s %-20s %-20d %-20s \n", "Return", "20/8/2020", 002, "Return procedure");

		  assertSame("Check that ViewAllProcedureList", Output, allProcedure);
	}
	@Test
	public void delProcedureTest() {
	}
	
	
	//TRANSACTION TESTS - Benedict
	@Test
	public void addTransactionTest() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Transaction arraylist to add to", transactionList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addTransaction(transactionList, t1);		
		assertEquals("Test if that Transaction arraylist size is 1?", 1, transactionList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Transaction is added same as 1st item of the list?", t1, transactionList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test that Transaction arraylist size is 2?", 2, transactionList.size());
	
	}
	
	
	@Test
	public void retrieveAllTransactions() {
		// Test if Item list is not null but empty, so that can add a new item - Error if null
		assertNotNull("Test if there is valid Camcorder arraylist to add to", transactionList);
		
		//test if the list of transactions retrieved from the SourceCentre is empty - Normal
				String allTransaction= C206_CaseStudy.retrieveTransactionList(transactionList);
				String testOutput = "";
				assertEquals("Check that ViewAllCamcorderlist", testOutput, allTransaction);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - Boundary
		C206_CaseStudy.addTransaction(transactionList, t1);
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, transactionList.size());
	}
	
	

	public void archiveTransactionTest() {
		
		//Test archiveList is empty - Normal
		assertEquals("Test if archiveList is empty", 0, archiveList.size());
		
		//Test archiveList can receive details from transactionList after archiving. - Normal
		C206_CaseStudy.addTransaction(transactionList, t1);	
		int pos = 0;
		archiveList.add(new Transaction(transactionList.get(0).getCusName(),transactionList.get(pos).getDate(),transactionList.get(pos).getStaffName(),transactionList.get(pos).getTransactionID()));
		transactionList.remove(pos);
		assertEquals("Test if archiveList received information from transactionList", 1, archiveList.size());
		
		//Test - Error, after archiving an old transaction, transactionList should not include the old transaction);
	    C206_CaseStudy.archiveTransaction(transactionList);
	    assertEquals("Test if transaction arraylist still consists the old transaction", 0, transactionList);
	    
	    
	}
	
	//END OF TRANSACTION TEST
	
	//CUSTOMER TESTS - Rupen
	@Test
	public void addCustomerTest() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Customer arraylist to add to", customerList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addCustomer(customerList, c1);		
		assertEquals("Test if that Customer arraylist size is 1?", 1, customerList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Customer is added same as 1st item of the list?", c1, customerList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addCustomer(customerList, c2);
		assertEquals("Test that Customer arraylist size is 2?", 2, customerList.size());
	
	}
	
	@Test
	 public void viewCustomerTest() { // rupen
	  // Test if Item list is not null but empty, so that can add a new item
	  assertNotNull("Test if there is valid Camcorder arraylist to add to", customerList);

	  // test if the list of customers retrieved from the SourceCentre is empty
	  String allCustomer= C206_CaseStudy.retrieveCustomerList(customerList); 
	  String testOutput = "";
	  assertEquals("Check that ViewAllcustomerList", testOutput, allCustomer);

	  // Given an empty list, after adding 2 items, test if the size of the list is 2
	  C206_CaseStudy.addCustomer(customerList, c1);
	  C206_CaseStudy.addCustomer(customerList, c2);
	  assertEquals("Test if that customer arraylist size is 2?", 2, customerList.size());

	  allCustomer = C206_CaseStudy.retrieveCustomerList(customerList); 

	  testOutput = String.format("%-10s %-20d  %-20d\n", "Martin", 12345678, 100);
	  testOutput += String.format("%-10s %-20d  %-20d\n", "Arthur", 87654321, 150);

	  assertEquals("Check that ViewAllcustomerList", testOutput, allCustomer);

	 }
	
	@Test
	 public void customerDeleteTest() {

	  assertNotNull("Test that the customer arraylist is not null: ", customerList);

	  C206_CaseStudy.addCustomer(customerList, c1);
	  C206_CaseStudy.addCustomer(customerList, c2);
	  assertEquals("Test that the size of the customer arraylist is 1 after adding 1 customer information.", 1,
	    customerList.size());

	  String output = C206_CaseStudy.retrieveCustomerList(customerList); 
	  assertEquals("Test if name does not exist , will return \"Fail to delete\"", "Fail to delete", output);

	  C206_CaseStudy.deleteCustomer(customerList);
	  assertEquals("Test that the size of the customer arraylist is 0 after deleting 1 customer.", 0,
	    customerList.size());

	 }
	//END OF CUSTOMER TEST
	
	//PRODUCT TESTS - Boon Ying
	public void addProductTest() {
	    // item list is not null, so can add new product information - boundary
	    assertNotNull("Test if there is valid product arraylist to add to", productList);
	    
	    // Given an empty list, after adding 1 item, the size of the list is 1 - normal
	    C206_CaseStudy.addProduct(productList, pr1);
	    assertEquals("Test if that product arraylist size is 1?", 1, productList.size());
	    
	    // item just added is as same as the first item of the list
	    assertSame("Test that product is added same as 1st item of the list? ", pr1, productList.get(0));
	    
	    // add another item. test the size of the list is 2 - normal
	    //The item just added is as same as the second item of the list
	    C206_CaseStudy.addProduct(productList, pr1);
	    assertEquals("Test that product arraylist size is 2? ", 2, productList.size());
	    assertSame("test that product is added? ", pr2, productList.get(1));
	    
	  }
	
	public void viewProductTest() {
	    // test if item list is not null but empty - boundary
	    assertNotNull("Test if there is valid product arraylist to view product information", productList);
	    
	    //test if the list of products view from the C206_CaseStudy is empty - boundary
	    String allProduct = C206_CaseStudy.retrieveProductList(productList);
	    String testoutput = "";
	    assertEquals("Check that ViewAllproductList", testoutput, allProduct);
	    
	    //Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
	    C206_CaseStudy.addProduct(productList, pr1);
	    C206_CaseStudy.addProduct(productList, pr2);
	    assertEquals("Test that product arraylist size is 2", 2, productList.size());
	  
	  }
	public void deleteProductTest() {
		    //boundary 
		    assertNotNull("Test if there is valid product arraylist to delete product information", productList);
		    C206_CaseStudy.deleteProduct(productList);
		    
		    // Given an empty list, after deleting 2 items, test if the size of the list is 0 - normal
		    C206_CaseStudy.deleteProduct(productList);
		    assertEquals("Test that product arraylist size is 0", 0, productList.size());
		    
		    
		  }
	
	//END OF PRODUCT TEST
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
