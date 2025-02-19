package pvsmobiles.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pvsmobiles.Model.Product;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// insert or save data
	@Transactional
	public void saveProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// Getting all the data
	public List<Product> getAllProducts() {
		List<Product> all = this.hibernateTemplate.loadAll(Product.class);
		return all;
	}

	// getting single object
	public Product getProduct(int ProductId) {
		Product product = this.hibernateTemplate.get(Product.class, ProductId);
		return product;
	}

	// getting single object
	@Transactional
	public void deleteProduct(int ProductId) {
		Product product = this.hibernateTemplate.get(Product.class, ProductId);
		this.hibernateTemplate.delete(product);
	}
}
