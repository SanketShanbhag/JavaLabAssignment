package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.NotFoundException;

public class EmployeeServiceImpl implements EmployeeServiceInterface {

	Map<Integer,Employee> map = new HashMap<>();
	
	@Override
	public String setDesignation(double salary) {
		
		String designation;
		
		if(salary>=40000)
		{
			designation = "Manager";
		}
		else if(salary>=20000&&salary<40000)
		{
			designation = "Programmer";
		}
		else if(salary>=5000&&salary<20000)
		{
			designation = "SystemAssociate";
		}
		else
		{
			designation = "Clerk";
		}
		return designation;
	}

	@Override
	public String setInsuranceScheme(String designation, double salary) {
		String scheme;
		if(designation == "Clerk")
			scheme = "NoScheme";
		else if(designation == "SystemAssociate")
			scheme = "SchemeC";
		else if(designation == "Programmer")
			scheme = "SchemeB";
		else
			scheme = "SchemeA";
		return scheme;
		
	}

	@Override
	public void addEmployee(Employee emp) throws NotFoundException {
		if(emp.getId()==0||emp.getName()==null||emp.getSalary()==0)
		{
			throw new NotFoundException("Insufficient Information");
		}
		else
		{
			map.put(emp.getId(), emp);
		}
	}

	@Override
	public void deleteEmployee(int id) throws NotFoundException {
		Employee e=map.get(id);
		if(e==null)
		{
			throw new NotFoundException("Id Not Found");
		}
		else
		{
			map.remove(id);
			System.out.println("employee with id "+id+" is deleted");
		}
	}

	@Override
	public void showEmpDetails(String Scheme) {
		for (Map.Entry<Integer,Employee> entry : map.entrySet())
		{
            Employee emp = entry.getValue();
            if(Scheme.equals(emp.getInsuranceScheme()))
            {
            	System.out.println(emp.getId()+","+emp.getName()+","+emp.getDesignation()+","+emp.getSalary());
            }
		}
	}
	

}
