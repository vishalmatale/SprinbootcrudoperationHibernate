package com.tcs.Dao;

import java.util.List;

import com.tcs.model.Employee;

public interface DaoI {

public Object savedata(Employee employee);
	
	
	public Employee getid(int id);
	
	public List<Employee>getall(Employee employee);
	
	public Employee update(Employee employee);
	
   public Employee deleteid(int id); 

    public void deletealldata(Employee employee);

	
}

	
	

