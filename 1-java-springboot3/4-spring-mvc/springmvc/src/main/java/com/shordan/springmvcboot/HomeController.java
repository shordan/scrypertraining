package com.shordan.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shordan.springmvcboot.model.Alien;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Aliens");
		
	}
	
	
	@RequestMapping("/")
	public String Home()
	{
		
		//System.out.println("Home page requested");
		return "index";
	}
	
	/*
	@RequestMapping("add")	
	public String add(HttpServletRequest req){
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int num3 = i+j;
		HttpSession session = req.getSession();
		session.setAttribute("num3", num3);
		return "result.jsp";
	}
	
	//forma resumida
	@RequestMapping("add")	
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session){
		int num3 = i+j;
		session.setAttribute("num3", num3);
		return "result.jsp";
	}
	
	
	//forma resumida sin http session y con modelandview
		@RequestMapping("add")	
		public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("result");
			int num3 = i+j;
			mv.addObject("num3", num3);
			return mv;
		}
		
		
		//forma resumida sin http session y con modelandview y sin el setViewName
		@RequestMapping("add")	
		public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
			ModelAndView mv = new ModelAndView("result");
			int num3 = i+j;
			mv.addObject("num3", num3);
			return mv;
		}
		*/
	
		//forma resumida sin http session , con model y con el metodo tipo String
		@RequestMapping("add")	
		public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m){
			int num3 = i+j;
			m.addAttribute("num3", num3);
			return "result";
		}
		//enves de ModelMap se puede poner solo Model 
		
		/*
		//addAlien metodo sin anottations
		@RequestMapping("addAlien")	
		public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelMap m){
			Alien a = new Alien();
			a.setAid(aid);
			a.setAname(aname);
			m.addAttribute("alien", a);
			return "result";
		}
		
		//addAlien resumido defrente todo se guarda en a, using @ModelAttribute
		@RequestMapping("addAlien")	
		public String addAlien(@ModelAttribute Alien a, ModelMap m){
			
			m.addAttribute("alien", a);
			return "result";
		}
		
		//addAlien sing @ModelAttribute sin el modelmap
		@RequestMapping("addAlien")	
		public String addAlien(@ModelAttribute Alien a){

			return "result";
		}
		*/
		//addAlien sing @ModelAttribute sin el modelmap y asignandole otro nombre a lo que se imprime en result.jsp
		@RequestMapping("addAlien")	
		public String addAlien(@ModelAttribute("a1") Alien a){

			return "result";
		}
		//@ModelAttribute("a1") , el result tambien se pone a1
		//si no pongo nada y en el result pongo alien (solo con alien funciona) por alguna razon funciona (no entiendo por qué)

}
