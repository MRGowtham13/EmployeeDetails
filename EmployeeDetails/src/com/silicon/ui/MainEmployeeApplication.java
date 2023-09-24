package com.silicon.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.silicon.crud.CrudImplementation;

public class MainEmployeeApplication {

	public static void main(String[] args) throws SQLException {
		CrudImplementation cmt = new CrudImplementation();
	
		 Scanner sn = new Scanner(System.in); 
			System.out.println("1. Employee Details");
			System.out.println("2. Add Employee Details");
			System.out.println("3. Update Employee Details");
			System.out.println("4. Delete Employee Details");
			
			int ob =sn.nextInt();
			 
			switch (ob) {
			case 1:  
				cmt.View_EmployeeDetails();
				break;
			case 2:
				cmt.Add_EmployeeDetails();
				break;
			case 3:
				cmt.Update_EmployeeDetails();
				break;
			case 4:
				cmt.Delete_EmployeeDetails();
				break;

			default:
				System.out.println("Invalid Selection in Employee Details");
				break;
			}
		
		
		
	}

}

