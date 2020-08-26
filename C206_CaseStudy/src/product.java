//Done By Boon Ying
public class product {
	private int productID;
	private String productName;
	private String description;
	private String category;
	private String supplierName;
	private double price;
	
	public product(int productID, String productName, String description, String category, String supplierName, double price) {
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.price = price;
		
	}
	
	public double getPrice() {
		return price;
	}

	public String toString() {
		return String.format("%-10d %-30s %-10s %-10s", productID, description, description, supplierName);
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
	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
		
}
