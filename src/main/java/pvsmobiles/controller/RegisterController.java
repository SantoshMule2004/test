package pvsmobiles.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import pvsmobiles.Model.User;
import pvsmobiles.Service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@RequestMapping("/register-page")
	public String Register(Model m) {
		m.addAttribute("title", "register page");
		return "register_page";
	}

	@RequestMapping("/login-page")
	public String Login(Model m) {
		m.addAttribute("title", "login page");
		return "login_page";
	}

	@RequestMapping(value = "/handle-user", method = RequestMethod.POST)
	public RedirectView HandleUser(@ModelAttribute("user") User user, HttpServletRequest request) {
		RedirectView r = new RedirectView();
		if (user.getPass().equals(user.getCpass())) {
			this.userService.saveUser(user);
			System.out.println(user + "User saved successfully..!");
			String path = request.getContextPath();
			r.setUrl(path + "/login-page");
			return r;
		}
		String path = request.getContextPath();
		r.setUrl(path + "/register-page");
		return r;
	}

	@RequestMapping(value = "/login-handle", method = RequestMethod.POST)
	public RedirectView HandleLogin(@RequestParam("id") int id, @RequestParam("pass") String pass,
			HttpServletRequest request) {
		RedirectView r = new RedirectView();
		User user = this.userService.getUser(id);
		String Confirm = user.getCpass();
		
		if(Confirm.equals(pass))
		{
			System.out.println(user);
			String path = request.getContextPath();
			r.setUrl(path + "/");
			return r;
		}
		String path = request.getContextPath();
		r.setUrl(path + "/login-page");
		return r;
	}
}
