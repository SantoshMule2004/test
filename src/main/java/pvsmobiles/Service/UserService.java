package pvsmobiles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pvsmobiles.Dao.UserDao;
import pvsmobiles.Model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void saveUser(User user) {
		this.userDao.saveUser(user);
	}
	
	public User getUser(int uid)
	{
		User user = this.userDao.getUser(uid);
		return user;
	}
	
	public List<User> getAllUsers() {
		List<User> users = this.userDao.getAllUsers();
		return users;
	}

	public void delete(int id) {
		this.userDao.deleteUser(id);
	}
}
