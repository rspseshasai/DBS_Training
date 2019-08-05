package com.demo.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Customer;
import com.demo.spring.entity.Temp;
@Controller
public class CustController{

	@Autowired
	private CustomerRepo cRepo;
	
	@Autowired
	TempRepo tRepo;
	
	//@Autowired
	private String temp_desc;
	
	//@Autowired
	private String temp_mail;
	
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public String getFirstPage(Model model) {
		Customer c = new Customer();
		Temp t = new Temp();
		model.addAttribute("temp", t); //table name
		model.addAttribute("customer", c);
		return "welcome";// return firstpagename.html
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getRegisterPage(Model model) {
		Customer c = new Customer();
		
		model.addAttribute("customer", c);
		return "registerForm";// return firstpagename.html
	}

	
	
	@RequestMapping(path = "/welcome", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("temp") Temp t) {
		ModelAndView mv = new ModelAndView();
		String myEmail = t.getEmail();
		
		int count = cRepo.countUsersWithEmail(myEmail);
		System.out.println("-----------"+count+"---------------");
		
		if(count==0) {
			tRepo.save(t);
			mv.setViewName("redirect:register");
			temp_desc = t.getProblemDesc();
			temp_mail = t.getEmail();
		}
		else {
			tRepo.save(t);
			mv.setViewName("confirmation");
			mv.addObject("email", t.getEmail());
			mv.addObject("problemDesc", t.getProblemDesc());
		}
		return mv;
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("customer") Customer c) {
		ModelAndView mv = new ModelAndView();
		c.setMail(temp_mail);
		cRepo.save(c);
		mv.setViewName("confirmation");
		mv.addObject("email", temp_mail);
		mv.addObject("problemDesc", temp_desc);
		return mv;
	}

}
