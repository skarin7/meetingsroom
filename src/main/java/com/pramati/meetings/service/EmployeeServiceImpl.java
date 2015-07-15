package com.pramati.meetings.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.meetings.dao.EmployeeDAO;
import com.pramati.meetings.model.Employee;

@Service("empservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empl;

	public void saveEmp() {
		empl.save();
	}

	public List<String> getEmpNames() {
		return empl.getEmpNames();
	}
	public List<Employee> getEmpNames(String useCriteria)
	{
		return empl.getEmpNames("true");
	}

	public boolean checkRoomAvailabilty(String date, String startTime,
			String endTime, String confID) {
		// TODO Auto-generated method stub
		return false;
	}

	public void reserveConfRoom(String date, String startTime, String endTime,String confID) {
		// TODO Auto-generated method stub
		
	}

}
