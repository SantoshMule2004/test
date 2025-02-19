package pvsmobiles.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pvsmobiles.Model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// insert or save data
	@Transactional
	public void saveUser(User user) {
		this.hibernateTemplate.save(user);
	}

	// Getting all the data
	public List<User> getAllUsers() {
		List<User> all = this.hibernateTemplate.loadAll(User.class);
		return all;
	}

	// getting single object using id
	public User getUser(int id) {
		User user = this.hibernateTemplate.get(User.class, id);
		return user;
	}

	// getting single object
	@Transactional
	public void deleteUser(int UserId) {
		User user = this.hibernateTemplate.get(User.class, UserId);
		this.hibernateTemplate.delete(user);
	}
}
