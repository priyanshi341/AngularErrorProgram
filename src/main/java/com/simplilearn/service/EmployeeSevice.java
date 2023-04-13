package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Employee;

public interface EmployeeSevice {

	public List<Employee> getallemployees();
	public Employee getsingleemployee(int id);
	public Employee updateemployee(Employee emp,int id);
	public Employee  saveemployee(Employee emp);
	public void deleteemployee(int id);
	
}
