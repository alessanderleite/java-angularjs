package br.com.alessanderleite.servletangular.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alessanderleite.servletangular.beans.Employee;
import br.com.alessanderleite.servletangular.service.EmployeeService;
import br.com.alessanderleite.servletangular.service.EmployeeServiceImpl;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Employee> list = employeeService.findAll();
		PrintWriter out = resp.getWriter();
		if (list.size() > 0) {
			
			out.print(list);
		}
		out.close();
	}
}
