package oppWithNLayeredApp.dateAccess;

import oppWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {

	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
		

	}
}

