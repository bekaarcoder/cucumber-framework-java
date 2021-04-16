package ProjectImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	
	public Product(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("Apple Macbook Pro");
		productList.add("Apple Macbook Air");
		productList.add("Apple iPhone 12");
		return productList;
	}
}
