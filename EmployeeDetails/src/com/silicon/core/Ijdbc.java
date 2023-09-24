package com.silicon.core;

import java.sql.Connection;
import java.sql.SQLException;

public interface Ijdbc {
	public static final String URL="jdbc:mysql://localhost:3306/Employee";
	public static final String USERNAME="root";
	public static final String PASSWORD="G@123";
	
	public Connection getConnection() throws SQLException;
   

}
