//Done By Boon Ying
public class product {
	private int productID;
	private String productName;
	private String description;
	private String category;
	private String vendor;
	private double price;
	private int vendorpoints;
	
	public product(int productID, String productName, String description, String category, String vendor, double price, int vendorpoints) {
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.vendor = vendor;
		this.price = price;
		this.vendorpoints = vendorpoints;
	}
	
	public String toString() {
		// Write your codes here
		return String.format("%-10d %-30s %-10s %-10s %-10s %-10.2f %-10d",productID, productName, description, category, vendor, price, vendorpoints);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVendorpoints() {
		return vendorpoints;
	}

	public void setVendorpoints(int vendorpoints) {
		this.vendorpoints = vendorpoints;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getvendor() {
		return vendor;
	}
}
