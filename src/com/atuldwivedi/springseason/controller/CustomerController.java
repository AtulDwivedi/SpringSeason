package com.atuldwivedi.springseason.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atuldwivedi.springseason.dao.CustomerDao;
import com.atuldwivedi.springseason.entity.Customer;
import com.atuldwivedi.springseason.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CustomerService customerService;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer newCustomer, BindingResult bindingResult) {
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}

	// --------------------
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listCustomers(Model model) {
		List<Customer> customers = customerDao.listCustomers();
		model.addAttribute("custs", customers);
		return "customers-list";
	}
	
	@GetMapping("/")
	public String getCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-save";
	}

	@PostMapping("/save")
	@Transactional
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} 
		Customer cust = customerService.addCutomer(customer);
		model.addAttribute("cust", cust);
		return "customer";
	}
}
