package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.NotFoundException;

public interface EmployeeServiceInterface{
	
	public String setDesignation(double salary);
	public String setInsuranceScheme(String designation,double salary);
	public void addEmployee(Employee emp) throws NotFoundException;
	public void deleteEmployee(int id) throws NotFoundException;
	public void showEmpDetails(String insuranceScheme);

}
