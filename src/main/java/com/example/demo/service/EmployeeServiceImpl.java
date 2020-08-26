package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeRepository;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeRepository empResository;	
	@Override
	public void save(Employee employee) {
		empResository.save(employee)
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
