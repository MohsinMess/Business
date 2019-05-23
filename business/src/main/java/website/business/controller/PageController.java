package website.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import website.backend.dao.categorydao;
import website.backend.dto.category;

@Controller
public class PageController 
{
	
	@Autowired
	private categorydao CategoryDAO;
	
	@RequestMapping(value={"/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userclickhome",true);
		mv.addObject("categories",CategoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userclickabout",true);
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv= new ModelAndView("page");	
		mv.addObject("title","Contact Us");
		mv.addObject("userclickcontact",true);
		return mv;
	}
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showallproducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("userclickallproducts",true);
		mv.addObject("categories",CategoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showcategoryproducts(@PathVariable("id") int id)
	{
		ModelAndView mv= new ModelAndView("page");
		category Category=null;
		Category= CategoryDAO.get(id);
		mv.addObject("title",Category.getName());
		// Passing list of products
		mv.addObject("categories",CategoryDAO.list());
		// Passing single category object
		mv.addObject("category",Category);
		mv.addObject("userclickcategoryproducts",true);
		
		return mv;
	}
	

}





