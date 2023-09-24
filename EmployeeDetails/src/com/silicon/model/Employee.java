package com.silicon.model;

public class Employee {
	 private int Id;
	 private String FirstName;
	 private String LastName;
	 private double Salary;
	 private String JobRoll;
	 private String Department;
	 
	 
     public int getId() {
		return Id;
	  }

     public void setId(int id) {
		Id = id;
	  }

     public String getFirstName() {
		return FirstName;
	  }

     public void setFirstName(String firstName) {
		FirstName = firstName;
	  }

     public String getLastName() {
		return LastName;
	  }
     
     public void setLastName(String lastName) {
		LastName = lastName;
	  }

     public double getSalary() {
		return Salary;
	  }

     public void setSalary(double salary) {
		Salary = salary;
	  }

     public String getJobRoll() {
		return JobRoll;
	  }

     public void setJobRoll(String jobRoll) {
		JobRoll = jobRoll;
	  }

     public String getDepartment() {
		return Department;
	  }

     public void setDepartment(String department) {
		Department = department;
	  }

}
