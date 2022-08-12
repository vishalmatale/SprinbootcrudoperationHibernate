package com.tcs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Dao.DaoI;
import com.tcs.model.Employee;
@Service
public class ServiceImpI implements ServiceI {

	
	
	@Autowired
	private DaoI daoI;

	@Override
	public Object savedata(Employee employee) {
		
		Object save = daoI.savedata(employee);
		
		return save;
	}

	

	@Override
	public Employee getid(int id) {
		
	    Employee id1 = daoI.getid(id);	
		return id1;
	}

	@Override
	public List<Employee> getall(Employee employee) {
		
		List<Employee> list = daoI.getall(employee);
		return list;
	}

	@Override
	public Employee update(Employee employee) {
		Employee update = daoI.update(employee);
		return update;
	}

	@Override
	public List<Employee> multipleupdate(List<Employee> employee) {
	
		
		return null;
	}

	

	@Override
	public Employee deleteid(int id) {
		Employee id1 = daoI.deleteid(id);
		
		return id1;
	}

	@Override
	public void deletealldata(Employee employee) {
		daoI.deletealldata(employee);
		
	}
	
	
}
