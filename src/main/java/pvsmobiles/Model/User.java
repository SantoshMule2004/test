package pvsmobiles.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String username;
	private String email;
	private String pass;
	private String cpass;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, String email, String pass, String cpass) {
		super();
		Id = id;
		this.username = username;
		this.email = email;
		this.pass = pass;
		this.cpass = cpass;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getCpass() {
		return cpass;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", email=" + email + ", pass=" + pass + ", cpass=" + cpass
				+ "]";
	}
}
