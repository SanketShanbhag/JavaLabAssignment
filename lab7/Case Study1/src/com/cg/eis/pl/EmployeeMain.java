package com.cg.eis.pl;



import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.NotFoundException;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeServiceImpl empService = new EmployeeServiceImpl();

		Scanner in = new Scanner(System.in);
		
		System.out.println("How many employees you want add?");
		int num = in.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter employee id :");
			int id = in.nextInt();
			
			System.out.println("Enter employee name :");
			String name = in.next();

			System.out.println("Enter employee salary :");
			double salary = in.nextDouble();
			
			String designation = empService.setDesignation(salary);
			
			String insuranceScheme = empService.setInsuranceScheme(designation,salary);
			
			try {
				empService.addEmployee(new Employee(id,name,salary,designation,insuranceScheme));
			} catch (NotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("added sucussesfully");
		}
		
		System.out.println("Enter insurance scheme to search and employee deatils :");
		
		String insuranceScheme = in.next();
		empService.showEmpDetails(insuranceScheme);
		
		System.out.println("Enter employee id to delete :");
		int eid = in.nextInt();
		try {
			empService.deleteEmployee(eid);
		} catch (NotFoundException e) {
			
			e.printStackTrace();
		}
	}


}
