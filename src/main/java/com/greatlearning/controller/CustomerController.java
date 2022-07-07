package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.entity.Customer;
import com.greatlearning.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerServiceImpl;
	

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> cust = customerServiceImpl.findAll();

		model.addAttribute("customers", cust);
		return "listCustomers";
	}

	@RequestMapping("/addCustomer")
	public String showFormForAdd(Model model) {

		Customer customer = new Customer();

		model.addAttribute("customers", customer);

		return "addCustomer";

	}
	
	@RequestMapping("/updateCustomer")
	public String showFormForUpdate(@RequestParam("id") int id, Model model) {

		Customer customer = customerServiceImpl.findById(id);

		model.addAttribute("customers", customer);

		return "addCustomer";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("eMail") String eMail) {

		Customer customer;
		if (id != 0) {
			customer = customerServiceImpl.findById(id);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.seteMail(eMail);

		} else {
			customer = new Customer(firstName, lastName,eMail);
		}

		customerServiceImpl.save(customer);

		return "redirect:/customer/list";

	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {

		customerServiceImpl.deleteById(id);
		return "redirect:/customer/list";
	}
	
	
}
