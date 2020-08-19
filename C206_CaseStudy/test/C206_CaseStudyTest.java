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
				p1 = new Procedure("Delete");
				p2 = new Procedure("Return");
				
				procedureList= new ArrayList<Procedure>();
				
				//TransactionID
				t1 = new Transaction(9100);
				t2 = new Transaction(9200);
				
				transactionList= new ArrayList<Transaction>();
				
				//productID, description, category, supplierName
				pr1= new product(001, "Item 1", "Category 1", "Marcus");
				pr2= new product(001, "Item 2", "Category 2", "George");
				
				productList= new ArrayList<product>();
				
				//location, outlet_id,number_of_staff
				o1= new Outlet("Raffles place", 01, 50);
				o2= new Outlet("Chinatown", 02, 40);
				
				outletList= new ArrayList<Outlet>();
				
	}
	
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
	
	
	
	
	
	
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
