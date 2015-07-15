package com.pramati.meetings;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pramati.meetings.model.Employee;
import com.pramati.meetings.service.EmployeeService;
import com.pramati.meetings.service.EmployeeServiceImpl;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SetUpAppConfig.class);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//	  	  ctx.register(SetUpAppConfig.class);
		  //ctx.refresh();
		EmployeeService empl=(EmployeeService) ctx.getBean("empservice");
		  empl.saveEmp();
		  List<String > test=empl.getEmpNames();
		  for (String name : test)
		  {
			  System.out.println(name);
		  }
		  
		  List<Employee> test2=empl.getEmpNames("test");
		  for (Employee samp : test2)
		  {
			  System.out.println(samp.getFirstname());
		  }
	}

}
