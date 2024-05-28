package com.kmss.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.kmss.springboot.entity.Employee;
import com.kmss.springboot.repository.MyRepository;

@Service
public class MyService {
	
	private final MyRepository myRepository;
	
	@Autowired
	public MyService(MyRepository myRepository)
	{
		this.myRepository = myRepository;
	}
	
	//create
	public Employee saveData(Employee e)
	{
		return myRepository.save(e);
	}
	
	//Read
	public List<Employee> getAllEmpData()
	{
		return myRepository.findAll();
	}
	
	//Update
	/*public Employee updateEmpData(@PathVariable int id,@RequestBody Employee e)
	{
		//return myRepository.saveById(id);
		Employee emp= myRepository.findById(id).get();
		emp.setName(e.getName());
		emp.setSalary(e.getSalary());
		
		return myRepository.save(emp);
	} */
	
	public Employee updateEmpData(@PathVariable int id, @RequestBody Employee e) {
	    Optional<Employee> optionalEmployee = Optional.empty();
	    if (optionalEmployee.isPresent()) {
	        Employee emp = optionalEmployee.get();
	        emp.setName(e.getName());
	        emp.setSalary(e.getSalary());
	        return myRepository.save(emp);
	    } else {
	        // Handle situation where ID is not found
	        throw new RuntimeException("Employee not found with ID: " + id);
	    }
	}


	
	//Delete
	public void deleteEmployee(int id)
	{
		myRepository.deleteById(id);
	}
	
}
