package pvsmobiles.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import pvsmobiles.Model.Product;
import pvsmobiles.Service.ProductService;

@Controller
public class MainController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String mainPage(Model model)
	{
		model.addAttribute("title", "Home page");
		return "index";
	}
	
	@RequestMapping("/mobiles")
	public String home(Model model)
	{
		List<Product> allProducts = this.productService.getAllProducts();
		System.out.println(allProducts);
		model.addAttribute("title", "mobile page");
		model.addAttribute("products", allProducts);
		return "mobiles_info";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "add product");
		return "add_product";
	}
	
	@RequestMapping(value ="/add-product", method=RequestMethod.POST)
	public RedirectView HandleProduct(@ModelAttribute("product") Product product, HttpServletRequest request)
	{
		RedirectView r = new RedirectView();
		this.productService.saveProduct(product);
		String path = request.getContextPath();
		r.setUrl(path+"/mobiles");
		return r;
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id , HttpServletRequest request)
	{
		RedirectView r = new RedirectView();
		this.productService.delete(id);
		String path = request.getContextPath();
		r.setUrl(path+"/mobiles");
		return r;
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id , HttpServletRequest request, Model m)
	{
		Product product = this.productService.getProduct(id);
		m.addAttribute("product", product);
		return "update_product";
	}
	
	/*@RequestMapping("/updateform/{id}")
	public String up(@PathVariable("id") int Id, Model m)
	{
		Product product = this.productService.getProduct(Id);
		m.addAttribute("product", product);
		return "update_product";
	}*/
}
