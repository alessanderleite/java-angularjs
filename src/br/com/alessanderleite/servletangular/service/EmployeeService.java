package br.com.alessanderleite.servletangular.service;

import java.util.List;

import br.com.alessanderleite.servletangular.beans.Employee;

public interface EmployeeService {

	List<Employee> findAll();
}
