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
				
				//productID, description, category, supplierName
				pr1= new product(001, "Item 1", "Category 1", "James", 13);
				pr2= new product(002, "Item 2", "Category 2", "George", 15);
				
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
		
		//test if the list of camcorders retrieved from the SourceCentre is empty - Normal
				String allTransaction= C206_CaseStudy.retrieveTransactionList(transactionList);
				String testOutput = "";
				assertEquals("Check that ViewAllCamcorderlist", testOutput, allTransaction);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - Boundary
		C206_CaseStudy.addTransaction(transactionList, t1);
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, transactionList.size());
	}
	
	
	
	
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
	
	
	
	
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
