package caseStudy;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeMain {

	public static void main(String[] args) {
		Department dept = new Department(1, 10, "abc");
		Department dept1 = new Department(2, 20, "xyz");
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList = Arrays.asList(
				new Employee(100, 1, "Abhiram", "Bhat", "abhiramb7@gmail.com", "9635471269", "Executive",
						LocalDate.of(2021, 4, 17), 25000d, dept),
				new Employee(201, 2, "Sundar", "Ram", "sundarram1@gmail.com", "9873246921", "Analyst",
						LocalDate.of(2021, 4, 11), 30000d, dept1),
				new Employee(103, 1, "Ananad", "Sharma", "ananadsharma@gmail.com", "8983277214", "Analyst",
						LocalDate.of(2021, 4, 05), 20500d, dept),
				new Employee(102, 1, "Monisha", "Shetty", "monishashetty@gmail.com", "9823732497", "Analyst",
						LocalDate.of(2021, 4, 17), 20000d, dept),
				new Employee(101, 1, "Rita", "Dixit", "ritadixit@gmail.com", "9657887314", "Analyst",
						LocalDate.of(2021, 4, 20), 23000d, dept),
				new Employee(202, 2, "Aditya", "Daman", "adityadaman@gmail.com", "9865674311", "Executive",
						LocalDate.of(2021, 4, 30), 20000d, dept1));

		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("Q1. Find out the sum of salary of all employees.");
		Optional<Double> o = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));

		if (o.isPresent()) {
			System.out.println("Sum of all Salaries: " + o.get());
		}
		System.out.println("Q2. List out department names and count of employees in each department.");

		Map<Department, Long> de = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(de);
		LocalDate d = LocalDate.now();
		
		System.out.println("Q3. List employee name and duration of their service in months and days.");
		empList.forEach(e -> System.out.println(e.getFirstName() + "\t " +Period.between(d, e.getHireDate())));
		
		System.out.println("Q4. Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name.");
		System.out.println("sorting by employee id: ");
		List<Employee> e1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId())).collect(Collectors.toList());
		System.out.println(e1);

		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\nsorting by First Name: ");
		e1 = empList.stream().sorted(Comparator.comparing(Employee::getFirstName))
				.collect(Collectors.toList());
		System.out.println(e1);

		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\n\nQ5. Find departments with highest count of employees.");
		de = empList.stream().limit(1).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(de);

		for (Object a : e1) {
			System.out.println(a);
		}
	}

	

}
