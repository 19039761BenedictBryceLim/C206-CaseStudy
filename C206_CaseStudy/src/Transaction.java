//Done by Benedict
public class Transaction {
	private String CusName;
	private String date;
	private String StaffName;
	private int transactionID;
	
	public Transaction(String CusName, String date, String StaffName, int transactionID) {
		this.CusName = CusName;
		this.date = date;
		this.StaffName = StaffName;
		this.transactionID = transactionID;
	}
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String CusName) {
		this.CusName = CusName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStaffName() {
		return StaffName;
	}
	public void setStaffName(String StaffName) {
		this.StaffName = StaffName;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getTransactionID() {
		return transactionID;
	}
	

		
}
