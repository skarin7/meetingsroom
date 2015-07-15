package com.pramati.meetings.dao;

import java.util.List;

import com.pramati.meetings.model.Employee;

public interface EmployeeDAO {
	public void save();
	public List<String> getEmpNames();
	public List<Employee> getEmpNames(String useCriteria);
	
	/**
	 * Checks if the meeting room is available at that time
	 * @param date
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public boolean checkRoomAvailabilty(String date,String startTime,String endTime ,String confID);
	

/**
 * @param date
 * @param startTime
 * @param endTime
 */
public void reserveConfRoom(String date,String startTime,String endTime,String confID);


}
