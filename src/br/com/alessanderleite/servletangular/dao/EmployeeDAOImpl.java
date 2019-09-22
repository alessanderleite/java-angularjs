package br.com.alessanderleite.servletangular.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alessanderleite.servletangular.beans.Employee;
import br.com.alessanderleite.servletangular.dao.util.ConnectionUtil;
import br.com.alessanderleite.servletangular.dao.util.SQLQuery;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<Employee> findAll() throws SQLException {
		
		List<Employee> empList = new ArrayList<Employee>();
		Connection con = ConnectionUtil.getNewConnection();
		PreparedStatement ps = con.prepareStatement(SQLQuery.SQL_SELECT_ALL_EMPLOYEE);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int empId = rs.getInt(1);
			String name = rs.getString(2);
			double salary = rs.getDouble(3);
			String designation = rs.getString(4);
			String address = rs.getString(5);
			Employee employee = new Employee(empId, name, salary, designation, address);
			empList.add(employee);
		}
		return empList;
	}

	@Override
	public int save(Employee employee) {
		return 0;
	}

}
