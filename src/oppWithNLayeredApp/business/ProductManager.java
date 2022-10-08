package oppWithNLayeredApp.business;

import oppWithNLayeredApp.dateAccess.HibernateProductDao;
import oppWithNLayeredApp.dateAccess.ProductDao;
import oppWithNLayeredApp.dateAccess.jdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	
	
  public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}



public static void add (Product product) throws Exception {
	  

	  if (product.getUnitPrice()<10) {
		  throw new Exception ("Ürün fiyatı 10 dan küçük olamaz"); 
	  }
	  ProductDao productDao= new HibernateProductDao();
	  
	  productDao.add(product);
	}

}
