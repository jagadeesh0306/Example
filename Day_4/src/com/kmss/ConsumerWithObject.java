package com.kmss;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String  ename;
	int salary;
	String gender;
	
	public Employee(String ename, int salary, String gender)
	{
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}
public class ConsumerWithObject {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Nani", 50000, "Male"));
		emplist.add(new Employee("shreya", 30000, "Female"));
		emplist.add(new Employee("Arjith", 20000, "Male"));
		emplist.add(new Employee("Sunitha", 56000, "Female"));
		
		//Function
		Function<Employee, Integer> f = emp ->(emp.salary*10)/100;
		
		//Predicate
		Predicate<Integer> p = b -> b>=5000;
		
		//Consumer
		Consumer<Employee> c = emp -> {
										System.out.println(emp.ename);
										System.out.println(emp.salary);
										System.out.println(emp.gender);
									  };
		for(Employee e : emplist)
		{
			int bonus = f.apply(e);    // calculate bonus
			
			if(p.test(bonus))         // Invoked Predicate
			{
				c.accept(e);          // Invoked Consumer
				System.out.println("Employee bonus : " + bonus);
			}
		}
	}  
}
