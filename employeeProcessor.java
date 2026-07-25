package com.empromotion;
//import com.empromotiom.employee;
public class employeeProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp=new employee(41,"Sri","Senior_Developer",45000.00,4);
		System.out.println("Employee ID: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Salary: " + emp.getSal());
		System.out.println("Employee Designation: " + emp.getDes());
		System.out.println("Employee Rating: " + emp.getPerformRating());
		emp.promoteEmployee();
		
		System.out.println("New Designation: " + emp.getDes());
        System.out.println("Updated Salary: $" + emp.getSal());
	}

}
