package com.silicon.crud;

import java.sql.SQLException;

public interface Icrud {
	public void View_EmployeeDetails() throws SQLException;
	public void Add_EmployeeDetails() throws SQLException;
	public void Update_EmployeeDetails () throws SQLException;
	public void Delete_EmployeeDetails() throws SQLException;

}
