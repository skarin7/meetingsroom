package com.pramati.meetings.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pramati.meetings.model.Employee;
@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
/*@Autowired
private HibernateTemplate hibernateTemplate;*/

  @Autowired
  SessionFactory sessionFactory;
  
  protected Session getSession() {
     return sessionFactory.getCurrentSession();
  }
	public void save ()
	{
		Employee emp =new Employee();
		emp.setFirstname("Shankar234");
		emp.setLastname("k");
		emp.setId("4646");
		getSession().saveOrUpdate(emp);
	}
	
	public List<String> getEmpNames() {
		
		Query hql=getSession().createQuery("select firstname from  Employee where id=:emp_id");
		hql.setParameter("emp_id", "114");
		hql.setMaxResults(3);
		return hql.list();
		
	}
	
	public List<Employee> getEmpNames(String isCriteria) {
		Criteria hql=getSession().createCriteria(Employee.class);
		hql.add(Restrictions.like("firstname", "sh%"));
		hql.setMaxResults(3).addOrder(Order.desc("id"));	
		return hql.list();
		
	}
	public boolean checkRoomAvailabilty(String date, String startTime,
			String endTime, String confID) {
		
		
		return false;
	}
	public void reserveConfRoom(String date, String startTime, String endTime,
			String confID) {
		
	}
}
