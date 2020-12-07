package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.jdi.Method;
import com.sun.research.ws.wadl.Request;

@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;
	@RequestMapping("/")
	public String edureka()
	{
		return "Edureka";	
	}
	@RequestMapping("/details")
	public String details(Customers customers)
	{
		repo.save(customers);
		return "redirect:/";	
	}
	@RequestMapping("/deleteall") 
	public String deleteall()
	{
		repo.deleteAll();
		return "redirect:/getdetails";
	}
	@RequestMapping("/delete") 
	public String getviews(@RequestParam("custid")int custid)
	{
		repo.deleteById(custid);
		return "redirect:/getdetails";
	}

	@RequestMapping("/getdetails")
	public ModelAndView getdata()
	{
		ModelAndView mv=new ModelAndView("Retrieve");
		List<Customers> customers=(List<Customers>) repo.findAll();
		mv.addObject("sss",customers);
		//System.out.println(repo.findByCustname("Arun"));
		//System.out.println(repo.findByCustidGreaterThan(1));
		//System.out.println(repo.findByCustnames());
		return mv;
	}
	
	@GetMapping("/customers")
	@ResponseBody
	public List<Customers> getcustomers()
	{
		return repo.findAll();   
	}
	@GetMapping("/customers/{custid}")
	@ResponseBody
	public Optional<Customers> getcustomerss(@PathVariable("custid")int custid)
	{
		return repo.findById(custid);
	}
	
	@PostMapping("/customers")
	public Customers getcustomers2(@RequestBody Customers customers)
	{
		repo.save(customers);
		return customers;
	}
	
	@DeleteMapping("/customers/{custid}")
	public Customers getcustomers3(@PathVariable("custid")int custid)
	{
		Customers cust=repo.getOne(custid);
		repo.delete(cust);
		return cust;
	}
	
	@PutMapping(path="/customers",consumes="application/json")
	public Customers getcustomers3(@RequestBody Customers customers)
	{
		repo.save(customers);
		return customers;
	}
	
	
}
