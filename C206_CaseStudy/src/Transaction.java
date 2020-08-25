//Done by Benedict
public class Transaction {
	private String CusName;
	private String date;
	private String StaffName;
	private int transactionID;
	private int phoneNumber;
	private int productID;
	
	public Transaction(String CusName, String date, String StaffName, int transactionID, int phoneNumber, int productID) {
		this.CusName = CusName;
		this.date = date;
		this.StaffName = StaffName;
		this.transactionID = transactionID;
		this.phoneNumber = phoneNumber;
		this.productID=productID;
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

		
}
