package com.tcs.Service;

import java.util.List;

import com.tcs.model.Employee;

public interface ServiceI {
public Object savedata(Employee employee);

	
	public Employee getid(int id);
	
	public List<Employee>getall(Employee employee);
	
	public Employee update(Employee employee);
	
	public List<Employee>multipleupdate(List<Employee>employee);
	
	public Employee deleteid(int id); 

    public void deletealldata(Employee employee);


}


