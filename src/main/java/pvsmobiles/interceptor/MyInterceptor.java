package pvsmobiles.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre handler");
		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");

		if ((name.isBlank()) && (email.isBlank()) && (pass.isBlank()) && (cpass.isBlank())) {
			System.out.println(name+" "+email+" "+pass+" "+cpass);
			String path = request.getContextPath();
			response.sendRedirect(path + "/register-page");
			return false;
		}
		return true;
	}
}
