
public class Transaction {
	private int transactionID;
	
	public Transaction(int transactionID) {
		this.transactionID = transactionID;
		
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getTransactionID() {
		return transactionID;
	}
	
	
	public void viewTransaction() {
		String output = " ";
		output += String.format("%-20d \n", getTransactionID());
		System.out.println(output);
	}
		
}
