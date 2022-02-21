package com.cg.eis.bean;

public class Employee {
		String name;
	   double salary;
	   int id;
	   String designation;
	   String InsuranceScheme;
	   
	   public Employee() {
	   }
	   
	   public Employee(int id,String name, double salary,  String designation,String InsuranceScheme) {
		   this.id = id;
		   this.name = name;
		   this.salary = salary;
	      this.designation = designation;
	      this.InsuranceScheme=InsuranceScheme;
	      
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public double getSalary() {
	      return salary;
	   }

	   public void setSalary(double salary) {
	      this.salary = salary;
	   }

	   public Integer getId() {
	      return id;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }

	   public String getDesignation() {
	      return designation;
	   }

	   public void setDesignation(String designation) {
	      this.designation = designation;
	   }

	   public String getInsuranceScheme() {
	      return InsuranceScheme;
	   }

	   public void setInsuranceScheme(String insuranceScheme) {
	      InsuranceScheme = insuranceScheme;
	   }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", designation=" + designation
				+ ", InsuranceScheme=" + InsuranceScheme + "]";
	}
	   
	   
	   
	   

}
