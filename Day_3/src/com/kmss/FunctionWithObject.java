package com.kmss;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	Employee(String ename, int salary)
	{
		this.ename = ename;
		this.salary = salary;
	}
}
public class FunctionWithObject {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Arjun", 50000));
		emplist.add(new Employee("Nani", 30000));
		emplist.add(new Employee("viraj", 20000));
		
		Function<Employee, Integer> fn = e ->
		{
			int sal = e.salary;
			
			if(sal>20000 && sal<=20000)
				return(sal * 10/100);
			else if(sal>20000 && sal<=30000)
				return(sal * 20/100);
			else if(sal>30000 && sal<=50000)
				return(sal * 30/100);
			else
				return(sal * 40/100);
		};
		
		Predicate<Integer> p = b -> b>50000;
		
		for(Employee emp : emplist)
		{
			int bonus = fn.apply(emp);  //Function
			
			if(p.test(bonus))  //predicate
			{
				System.out.println(emp.ename + " " + emp.salary);
				System.out.println("Bonus is : " + bonus);
			}
		}
	}
}
