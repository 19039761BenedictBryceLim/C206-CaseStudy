
public class product {
	private int productID;
	private String description;
	private String category;
	private String supplierName;
	
	public product(int productID, String description, String category, String supplierName) {
		this.productID = productID;
		this.description = description;
		this.category = "";
		this.supplierName = supplierName;
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public String getSupplierName() {
		return supplierName;
	}
		
}
