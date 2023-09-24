package com.silicon.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection implements Ijdbc {

		Connection con;
	    
	    public Connection getConnection() throws SQLException {
	     Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		 return con;
	    
	}
}
