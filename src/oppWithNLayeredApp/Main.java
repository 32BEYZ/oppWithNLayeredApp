package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product ( 1, "Iphone Xr",985687454);
		 ProductManager productManager = new ProductManager (new JdbcProductDao());
		  ProductManager.add(product1);
	

	}

}
