package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Service.ServiceI;
import com.tcs.model.Employee;
@RestController
public class EmployeeController {

	
	 @Autowired
		private ServiceI serviceI;
	    
	   @PostMapping (value="/savedata",consumes="Application/json")
	    public ResponseEntity<String>savedata(@RequestBody Employee employee){
	    	Object save = serviceI.savedata(employee);
	    	
	    	String msg=save.toString()+"save data sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	    	
	    }
	    
	   @GetMapping(value="/getall",consumes = "Application/json")
	    public ResponseEntity<List<Employee>>getalldata(@RequestBody Employee employee){
	    	
	    	List<Employee> list = serviceI.getall(employee);
			return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	    	
	    	 }
	    @PostMapping(value="/update",consumes = "Application/json")
	    public ResponseEntity<String>update(@RequestBody Employee employee){
	    	
	    	Employee update = serviceI.update(employee);
	    	String msg=update+"update data sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	    	
	    }
	  
	    
	    @GetMapping(value="/getid/{id}",consumes = "Application/json")
		public ResponseEntity<String>getid(@PathVariable int id){
			
			Employee id1 = serviceI.getid(id);
			String msg=id1+"id get sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		}
	    @PostMapping(value="/delete/{id}",consumes = "Application/json")
	    public ResponseEntity<String>deleteid(@PathVariable int id){
	    	
	    	Employee id1 = serviceI.deleteid(id);
	    	String msg=id1+"id delete sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	    	}
	    
	    
	    @GetMapping(value="/deleteall",consumes = "Application/json",produces = "Application/json")
	    public ResponseEntity<String>deleteall(Employee employee){
	    	
	    	serviceI.deletealldata(employee);
	    	String msg="all data delete sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	    	
	    	
	    	
	    }
	    
}
