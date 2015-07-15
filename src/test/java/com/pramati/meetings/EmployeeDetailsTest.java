package com.pramati.meetings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.pramati.meetings.model.Employee;
import com.pramati.meetings.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SetUpAppConfig.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class EmployeeDetailsTest {
	
	AbstractApplicationContext ctx;
	@Autowired
	EmployeeService empservice;


	@Test
	@Ignore
	public void checkEmployee() {
		
		  List<Employee> test2=empservice.getEmpNames("test");
			 Assert.assertEquals("Shankar234", test2.get(0).getFirstname());
	}
	@Test
	@Ignore
	public void addEmployee()
	{
		empservice.saveEmp();
	}

	@Test
	
	public void testDate()
	{
		String date="20-11-2014";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date dat2= sdf.parse(date);
			java.sql.Date dqldate= new java.sql.Date(dat2.getTime()); 
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
