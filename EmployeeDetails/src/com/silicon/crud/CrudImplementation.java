package com.silicon.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.silicon.core.JdbcConnection;
import com.silicon.model.Employee;

public class CrudImplementation implements Icrud{
	
	Employee emp =new Employee();
	JdbcConnection js=new JdbcConnection();

	 Scanner sc= new Scanner(System.in);
	   
                
	public void View_EmployeeDetails() throws SQLException {
		System.out.println("View_EmployeeDetails");
		
		String query="Select * from Employee";
		Connection con=js.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		 ResultSet rs=ps.executeQuery();
		 
		 while(rs.next()) {
			 emp.setId(rs.getInt(1));
			 emp.setFirstName(rs.getString(2));
			 emp.setLastName(rs.getString(3));
			 emp.setSalary(rs.getInt(4));
			 emp.setJobRoll(rs.getString(5));
			 emp.setDepartment(rs.getString(6));
			
		 
	          int Id  =emp.getId();
	          String firstname =emp.getFirstName();
	          String lastname =emp.getLastName();
	          double salary =emp.getSalary();
	          String jobroll =emp.getJobRoll();
	          String department =emp.getDepartment();
		
	        System.out.println(Id+"--" + firstname +"--"+ lastname +"--"+ salary +"--"+ jobroll +"--"+ department);
		 }
		 con.close();
		 
		} 
	
	public void Add_EmployeeDetails() throws SQLException {
		System.out.println("Add_EmployeeDetails");
		
		String query ="insert into Employee(Id,FirstName,LastName,Salary,JobRole,Department) values(?,?,?,?,?,?)";
		Connection con=js.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		
		 System.out.println("Enter the Employee Id");
		 int id=sc.nextInt();
		 emp.setId(id);
		 
		 
		 System.out.println("Enter the Employee First Name");
		 String fn=sc.next();
		 emp.setFirstName(fn);
		 
		 
		 System.out.println("Enter the Employee Last Name");
		 String ln=sc.next();
		 emp.setLastName(ln);
		 
		 
		 System.out.println("Enter the Employee Salary");
		 double  sly=sc.nextInt();
		 emp.setSalary(sly);
		 
		 
		 System.out.println("Enter the Employee JobRole");
		 String jr=sc.next();
		 emp.setJobRoll(jr);
		 
		 
		 System.out.println("Enter the Employee Department");
		 String dpt=sc.next();
		 emp.setDepartment(dpt);
		 
		 
		 ps.setInt(1,emp.getId());
         ps.setString(2, emp.getFirstName());
         ps.setString(3, emp.getLastName());
         ps.setDouble(4, emp.getSalary());
         ps.setString(5, emp.getJobRoll());
         ps.setString(6, emp.getDepartment());
         
         int updated = ps.executeUpdate();
         if(updated > 0) {
        	 View_EmployeeDetails();
         }
         else {
        	 System.out.println("Not Successfull");
         }
		 
	}
	
	
	
	public void Update_EmployeeDetails() throws SQLException { 
		System.out.println("Update_EmployeeDetails");
		
		
       String query ="update Employee set FirstName=?, LastName=?, Salary=?, JobRole=?, Department=? where Id=?";
   	Connection con=js.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		
		 System.out.println("Enter the Employee_Id for Reference to Update");
		 int id=sc.nextInt();
		 emp.setId(id);
		 
		 
		 System.out.println("Enter the Employee First Name");
		 String fn=sc.next();
		 emp.setFirstName(fn);
		 
		 
		 System.out.println("Enter the Employee Last Name");
		 String ln=sc.next();
		 emp.setLastName(ln);
		 
		 
		 System.out.println("Enter the Employee Salary");
		 double  sly=sc.nextInt();
		 emp.setSalary(sly);
		 
		 
		 System.out.println("Enter the Employee JobRole");
		 String jr=sc.next();
		 emp.setJobRoll(jr);
		 
		 
		 System.out.println("Enter the Employee Department");
		 String dpt=sc.next();
		 emp.setDepartment(dpt);
		 
		 
		 ps.setInt(6,emp.getId());
         ps.setString(1, emp.getFirstName());
         ps.setString(2, emp.getLastName());
         ps.setDouble(3, emp.getSalary());
         ps.setString(4, emp.getJobRoll());
         ps.setString(5, emp.getDepartment());
        
        int updated = ps.executeUpdate();
        if(updated > 0) {
       	 View_EmployeeDetails();
        }
        else {
       	 System.out.println("Not Successfull");
        }
		 
	}
		
	
	public void Delete_EmployeeDetails() throws SQLException {
		System.out.println("Delete_EmployeeDetails"); 
		
        String query ="Delete from Employee where Id=?";
    	Connection con=js.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		
		 System.out.println("Enter the Employee Id");
		 int id=sc.nextInt();
		 emp.setId(id);
		
		
		 ps.setInt(1,emp.getId());
		 int updated = ps.executeUpdate();
	        if(updated > 0) {
	       	 View_EmployeeDetails();
	        }
	        else {
	       	 System.out.println("Not Deleted");
	        }
		
		
	}
	
	
}

