package com.shordan.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
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
	*/
	
	//forma resumida sin http session
		@RequestMapping("add")	
		public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("result");
			int num3 = i+j;
			mv.addObject("num3", num3);
			return mv;
		}

}
