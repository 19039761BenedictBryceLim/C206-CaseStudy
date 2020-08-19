
public class Transaction {
	private int transactionID;
	private String transactionName;
	
	public Transaction(int transactionID, String transactionName) {
		this.transactionID = transactionID;
		this.transactionName = transactionName;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public String getTransactionName() {
		return transactionName;
	}
	
	public void viewTransaction() {
		String output = " ";
		output += String.format("%-20s -20d \n", getTransactionName(), getTransactionID());
		System.out.println(output);
	}
		
}
