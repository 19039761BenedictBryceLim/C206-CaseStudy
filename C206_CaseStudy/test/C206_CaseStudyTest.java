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
				p2 = new Procedure("Exchange", "20/8/2020", 002, "Exchange procedure");
				
				procedureList= new ArrayList<Procedure>();
				
				//TransactionID
				t1 = new Transaction("Melvin", "20/8/2020", "Joe", 9100, 99999999, 900);
				t2 = new Transaction("John", "20/8/2020", "Joe", 9200, 88888888, 800);
				
				transactionList= new ArrayList<Transaction>();
				
				//productID,name, description, category, supplierName, price
		        pr1= new product(001,"Dairy" , "cleanser", "beauty", "Marcus", 40);
		        pr2= new product(002,"JKS", "toner", "beauty", "George", 30);
				
				productList= new ArrayList<product>();
				
				//location, outlet_id,number_of_staff
				o1= new Outlet("Raffles place", 01, 50);
				o2= new Outlet("Chinatown", 02, 40);
				
				outletList= new ArrayList<Outlet>();
				
	}
	
	//PROCEDURE TESTS - Daryl
	@Test 
	public void addProcedureTest() {
		// Procedure list is not null, so that can add a new item - Normal
		assertNotNull("Test if there is valid Procedure arraylist to add to", procedureList);
		
		//Given an empty Procedure list, after adding 1 item, the size of the list is 1 - Normal
		C206_CaseStudy.addProcedure(procedureList, p1);		
		assertEquals("Test if that Procedure arraylist size is 1?", 1, procedureList.size());
		
		//The item just added is as same as the first item of the list - Error
		assertSame("Test that Procedure is added same as 1st item of the list?", p1, procedureList.get(0));
		
		//Add another item. test The size of the list is 2? - Boundary
		C206_CaseStudy.addProcedure(procedureList, p2);
		assertEquals("Test that Procedure arraylist size is 2?", 2, procedureList.size());
	
	}
	@Test
	public void viewProcedureTest() {


		  //Test if the list of Procedure retrieved from the C206_CaseStudy is empty - Error
		  String allProcedure= C206_CaseStudy.retrieveProcedureList(procedureList); 
		  String Output = "";
		  assertEquals("Check that ViewAllProcedureList", Output, allProcedure);

		  //Given an empty list, after adding 2 items, test if the size of the list is 2 - Boundary
		  C206_CaseStudy.addProcedure(procedureList, p1);
		  C206_CaseStudy.addProcedure(procedureList, p2);
		  assertEquals("Test if Procedure ArrayList size is 2?", 2, procedureList.size());
		  
		// Test if Procedure list is not null but empty, so that can add a new item - Normal
			assertNotNull("Test if there is valid Camcorder arraylist to add to", procedureList);
		  
		  
	}
	@Test
	public void delProcedureTest() {

		//Test that there is something delete in the procedureList - Boundary
	    assertNotNull("Test if there is valid Procedure arraylist to delete", procedureList);
	    procedureList.clear();
	    
	    // Given an empty Procedure list, after deleting 2 items, test if the size of the list is 0 - Normal
	    C206_CaseStudy.addProcedure(procedureList, p1);
	    C206_CaseStudy.addProcedure(procedureList, p2);
		procedureList.clear();
		assertEquals("Test that procedureList is empty after delete", 0, procedureList.size());
		
		//Test that procedureList can't be cleared if it's empty - Error
		assertEquals("Test that procedureList is empty after delete", 0, procedureList.size());
		procedureList.clear();
		

		
	}
	
	@Test
	public void updateProceduredateTest()
	{
		
		//Normal
		C206_CaseStudy.addProcedure(procedureList, p1);
		C206_CaseStudy.updateProcedure(procedureList); // Update test - Delete
		assertSame("Test that Procedure added and updated is same as 1st item of the list?", p1, procedureList.get(0));
		
		//Boundary (Don't think can be tested)
		
		
		//Error
		C206_CaseStudy.updateProcedure(procedureList);
		assertNotSame("Test that Procedure updated is not the same as 1st item of the list", p2, procedureList.get(1)); //change to procedureList.get(0) for error
		
		
		
	}
	
	
	//END OF PROCEDURE TESTS
	//TRANSACTION TESTS - Benedict
	@Test
	public void addTransactionTest() {
		// Transaction list is not null, so that can add a new item - Boundary
		assertNotNull("Test if there is valid Transaction arraylist to add to", transactionList);
		
		//Given an empty Transaction list, after adding 1 item, the size of the list is 1 - Normal
		C206_CaseStudy.addTransaction(transactionList, t1);		
		assertEquals("Test if that Transaction arraylist size is 1?", 1, transactionList.size());
		
		//The item just added is as same as the first item of the transactionList - Normal
		assertSame("Test that Transaction is added same as 1st item of the list?", t1, transactionList.get(0));
		
		//Add another item. test The size of the list is 2? - Error if not 2
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test that Transaction arraylist size is 2?", 2, transactionList.size());
	
	}
	
	
	@Test
	public void retrieveAllTransactions() {
		// Test if Transaction list is not null but empty, so that can add a new item - Error if null
		assertNotNull("Test if there is valid Transaction arraylist to add to", transactionList);
		
		//test if the list of transactions retrieved from the C206_CaseStudy is empty - Normal
				String allTransaction= C206_CaseStudy.retrieveTransactionList(transactionList, customerList, productList);
				String testOutput = "";
				assertEquals("Check that allTransaction", testOutput, allTransaction);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - Boundary
		C206_CaseStudy.addTransaction(transactionList, t1);
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test if that transactionList size is 2?", 2, transactionList.size());
	}
	
	

	public void archiveTransactionTest() {
		
		//Test archiveList is empty - Normal
		assertEquals("Test if archiveList is empty", 0, archiveList.size());
		
		//Test archiveList can receive details from transactionList after archiving. - Normal
		C206_CaseStudy.addTransaction(transactionList, t1);	
		int pos = 0;
		archiveList.add(new Transaction(transactionList.get(pos).getCusName(), transactionList.get(pos).getDate(),
				transactionList.get(pos).getStaffName(), transactionList.get(pos).getTransactionID(), transactionList.get(pos).getPhoneNumber(),transactionList.get(pos).getProductID()));
		transactionList.remove(pos);
		assertEquals("Test if archiveList received information from transactionList", 1, archiveList.size());
		
		//Test - Error, after archiving an old transaction, transactionList should not include the old transaction);
	    C206_CaseStudy.archiveTransaction(transactionList);
	    assertEquals("Test if transaction arraylist still consists the old transaction", 0, transactionList);
	    
	    
	}
	
	
	@Test
	public void updateTransactionTest()
	{
		
		//Normal
		C206_CaseStudy.addTransaction(transactionList, t1);
		C206_CaseStudy.updateTransaction(transactionList,customerList,productList); // Update test - Delete
		assertSame("Test that Transaction added and updated is same as 1st item of the list?", t1, transactionList.get(0));
		
		//Boundary (Don't think can be tested)
		
		//Error
		
		C206_CaseStudy.updateTransaction(transactionList,customerList,productList);
		assertNotSame("Test that Transaction updated is not the same as 1st item of the list", t2, transactionList.get(1)); //change to transactionList.get(0) for error
		
		
		
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
	 public void viewCustomerTest() {
	  // Test if Item list is not null but empty, so that can add a new item - Boundary
	  assertNotNull("Test if there is valid customer arraylist to add to", customerList);

	  // test if the list of customers retrieved from the SourceCentre is empty - Error
	  String allCustomer= C206_CaseStudy.retrieveCustomerList(customerList); 
	  String testOutput = "";
	  assertEquals("Check that allCustomer", testOutput, allCustomer);

	  // Given an empty list, after adding 2 items, test if the size of the list is 2 - Normal
	  C206_CaseStudy.addCustomer(customerList, c1);
	  C206_CaseStudy.addCustomer(customerList, c2);
	  assertEquals("Test if that customer arraylist size is 2?", 2, customerList.size());
	 }
	
	@Test
	 public void customerDeleteTest() {

		//Test that there is something delete in the array list - Boundary
	    assertNotNull("Test if there is valid customer arraylist to delete product information", customerList);
	    customerList.clear();
	    
	    // Given an empty list, after deleting 2 items, test if the size of the list is 0 - Normal
	    C206_CaseStudy.addCustomer(customerList, c1);
	    C206_CaseStudy.addCustomer(customerList, c2);
	    customerList.clear();
		assertEquals("Test that customerList is empty after delete", 0, procedureList.size());
		
		//Test that procedureList can't be cleared if it's empty - Error
		assertEquals("Test that customerList is empty after delete", 0, procedureList.size());
		customerList.clear();
		
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
	    assertEquals("Check that allProduct", testoutput, allProduct);
	    
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
		    
		  //Test that productList can't be cleared if it's empty - Error
			assertEquals("Test that productList is empty after delete", 0, productList.size());
			productList.clear();
		  }
	
	/*
	public void TopVendorsreturnTest() {
	    // boundary
	    assertNotNull("Test if there is valid vendor in the arraylist to return ", productList);
	    C206_CaseStudy.addProduct(productList, pr1);
	    C206_CaseStudy.addProduct(productList, pr2);
	    
	    // normal - Given an empty list, after returning 2 vendors, test if the size of the list is 0
	    C206_CaseStudy.addProduct(productList, pr1);
	      C206_CaseStudy.addProduct(productList, pr2);
	      C206_CaseStudy.returnVendor(productList);
	      assertEquals("Test that the vendor in product arraylist size is 0", 0, productList.size());
	      
	      // Test that the top vendor return in the productList can't be viewed if it's empty - error
	      assertEquals("Test that vendor in the productList is empty after return", 0, productList.size());
	*/
	
	//END OF PRODUCT TEST
	
	//OUTLET TEST - Yufan
	public void addOutletTest() {
	    // item list is not null, able to add new outlets - Boundary
	    assertNotNull("Test if there is valid outlet arraylist to add to", outletList);
	    
	    // Given an empty outlet list, after adding 1 item, the size of the list is 1 - normal
	    C206_CaseStudy.addOutlet(outletList, o1);
	    assertEquals("Test if that outlet arraylist size is 1?", 1, outletList.size());
	    
	    // item just added is as same as the first item of the list
	    assertSame("Test that outlet is added same as 1st item of the list? ", pr1, outletList.get(0));
	    
	    // add another item. test the size of the list is 2 - normal
	    //The item just added is as same as the second item of the list
	    C206_CaseStudy.addOutlet(outletList, o1);
	    assertEquals("Test that outlet arraylist size is 2? ", 2, outletList.size());
	    assertSame("test that outlet is added? ", pr2, outletList.get(1));
	    
	  }
	
	public void viewOutletTest() {
	    // test if item list is not null but empty - boundary
	    assertNotNull("Test if there is valid outlet arraylist to view outlet information", outletList);
	    
	    //test if the list of outlet view from the C206_CaseStudy is empty - boundary
	    String allOutlet = C206_CaseStudy.retrieveAllOutlet(outletList);
	    String testoutput = "";
	    assertEquals("Check that ViewAllproductList", testoutput, allOutlet);
	    
	    //Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
	    C206_CaseStudy.addOutlet(outletList, o1);
	    C206_CaseStudy.addOutlet(outletList, o2);
	    assertEquals("Test that outlet arraylist size is 2", 2, outletList.size());
	  
	  }
	public void deleteOutletTest() {
		    //Test if outletList is not null and is able to delete outlet information
		    assertNotNull("Test if there is valid outlet arraylist to delete outlet information", outletList);
		    C206_CaseStudy.deleteOutlet(outletList);
		    
		    // Given an empty list upon deleting 2 items, test if the size of the list is 0 - Normal
		    C206_CaseStudy.deleteOutlet(outletList);
		    assertEquals("Test that outlet arraylist size is 0", 0, outletList.size());
		    
		  //Test that procedureList can't be cleared if it's empty - Error
			assertEquals("Test that procedureList is empty after delete", 0, productList.size());
			productList.clear();
			
		  }
	//END OF OUTLET TEST
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
