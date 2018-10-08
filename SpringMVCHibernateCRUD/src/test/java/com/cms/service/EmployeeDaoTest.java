package com.cms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cms.dao.EmployeeDAO;
import com.cms.dao.EmployeeDAOImpl;
import com.cms.model.Employee;

public class EmployeeDaoTest {
   private EmployeeDAO employeeDao;
	@Before
	public void setUp() throws Exception {
		employeeDao = new EmployeeDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		employeeDao = null;
	}

//	@Test
//	@Transactional    
//	public void testAddEmployee(){
//	 Employee employee=new Employee();
//	 employee.setName("test");
//	 employee.setEmail("rohit@cms.in");
//	 employee.setAddress("ban");
//	 employee.setTelephone("1234565");
//	 employeeDao.addEmployee(employee);
//	 
//	 List<Employee> list = employeeDao.getAllEmployees();
//	 assertEquals(1, list.size());
//	 
//	}
	
//	@Test
//	public void testgetAllEmployees() {
//		List<Employee> list = employeeDao.getAllEmployees();
//		assertTrue(list.size()>0);
//	}

}

