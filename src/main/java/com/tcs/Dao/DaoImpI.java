package com.tcs.Dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Employee;
@Repository
public class DaoImpI implements DaoI {

	@Autowired
	private SessionFactory session;

	public Object savedata(Employee employee) {
		    
		Session session2 = session.openSession();
		session2.beginTransaction();
		Serializable save = session2.save(employee);
		session2.getTransaction().commit();
		return save;
	}

	
	@Override
	public Employee getid(int id) {
	Session session2=session.openSession();
	      Employee id1 = session2.get(Employee.class, id);
		
		return id1;
	}

	@Override
	public List<Employee> getall(Employee employee) {
		Session session2 = session.openSession();
		session2.beginTransaction();
		String sql="from Employee";
		Query query = session2.createQuery(sql);
		   List list = query.getResultList();
		session2.getTransaction().commit();
	    return list;
	}


	
	@Override
	public Employee update(Employee employee) {
		
		Session session2 = session.openSession();
		session2.beginTransaction();
		session2.update(employee);
		session2.getTransaction().commit();
		session2.close();
		
		Session session3 = session.openSession();
		Employee update = session3.get(Employee.class, employee.getEmpId());
		return update;
	}

	
	
	@Override
	public Employee deleteid(int id) {
		Session session2 = session.openSession();
		session2.beginTransaction();
		Employee id1 = session2.get(Employee.class, id);
		session2.delete(id1);
		session2.getTransaction().commit();
		return null;
	}

	@Override
	public void deletealldata(Employee employee) {
		Session session2 = session.openSession();
		session2.beginTransaction();
		String sql="delete from Employee";
		Query query = session2.createQuery(sql);
		int deleteall = query.executeUpdate();
		session2.getTransaction().commit();
		
	}

}

	

