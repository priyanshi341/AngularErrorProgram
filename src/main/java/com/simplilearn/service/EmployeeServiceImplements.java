package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Employee;
import com.simplilearn.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplements implements EmployeeSevice{

	@Autowired
	public EmployeeRepository ref;

	@Override
	public List<Employee> getallemployees() {
		
		return ref.findAll();
	}

	@Override
	public Employee getsingleemployee(int id) {
		
		return ref.findById(id).get();
	}

	@Override
	public Employee updateemployee(Employee emp,int id) {
		Employee empref=ref.findById(id).get();
		empref.setEmail(emp.getEmail());
		empref.setFirstname(emp.getFirstname());
		empref.setLastname(emp.getLastname());
		return ref.save(empref);
	}

	@Override
	public Employee saveemployee(Employee emp) {
		return ref.save(emp);
		
	}

	@Override
	public void deleteemployee(int id) {
		ref.deleteById(id);
		
	}
}
