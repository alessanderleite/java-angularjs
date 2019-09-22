package br.com.alessanderleite.servletangular.dao;

import java.util.List;

import br.com.alessanderleite.servletangular.beans.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
}
