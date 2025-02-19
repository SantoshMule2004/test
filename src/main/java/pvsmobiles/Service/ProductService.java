package pvsmobiles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pvsmobiles.Dao.ProductDao;
import pvsmobiles.Model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public void saveProduct(Product product) {
		this.productDao.saveProduct(product);
	}

	public Product getProduct(int id) {
		Product product = this.productDao.getProduct(id);
		return product;
	}

	public List<Product> getAllProducts() {
		List<Product> products = this.productDao.getAllProducts();
		return products;
	}

	public void delete(int id) {
		this.productDao.deleteProduct(id);
	}
}
