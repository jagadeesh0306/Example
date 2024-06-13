package com.techpalle;

public class MainClass {

	public static void main(String[] args) 
	{
      Employee e = new Employee(1,"jagadeesh",50000);
      e.setEno(2);
      System.out.println(e.getEno());

	}

}
 class Employee
 {
	 private int eno;
	 private String ename;
	 private int esal;
	public Employee(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEno()
	{
		return eno;
	}
	public void setEno(int eno) 
	{
		this.eno = eno;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	 
  
 }