package br.com.alessanderleite.servletangular.service;

import java.util.ArrayList;
import java.util.List;

import br.com.alessanderleite.servletangular.beans.Employee;
import br.com.alessanderleite.servletangular.dao.EmployeeDAO;
import br.com.alessanderleite.servletangular.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public List<Employee> findAll() {
		
		List<Employee> list = new ArrayList<Employee>();
		try {
			list = employeeDAO.findAll();
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
}
