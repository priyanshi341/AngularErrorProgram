package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Employee;

import com.simplilearn.service.EmployeeSevice;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeSevice ref;
	
	@GetMapping("/employees")
	public List<Employee> getmethod()
	{
		return ref.getallemployees();
	}
	
	@PostMapping("/employees")
	public Employee saveemployeedata(@RequestBody Employee emp)
	{
		return ref.saveemployee(emp);
	}
	
	@GetMapping("/employees/{id}")
	public Employee getsingleemployeedetail(@PathVariable int id)
	{
		return ref.getsingleemployee(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updatefunction(@RequestBody Employee emp,@PathVariable int id)
	{
		return ref.updateemployee(emp, id);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public void deletmethod(@PathVariable int id)
	{
		ref.deleteemployee(id);
		
		
	}
	
}
