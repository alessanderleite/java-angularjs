package br.com.alessanderleite.servletangular.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.alessanderleite.servletangular.beans.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll() throws SQLException;
	int save(Employee employee);
}
