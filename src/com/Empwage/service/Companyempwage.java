package com.Empwage.service;
import com.Empwage.model.Employee;

public class Companyempwage{

	public final String company;
	public final int wage_per_hour;
	public final int monthly_working_days;
	public final int monthly_working_hours;
	public int total_salary;

	public Companyempwage(String company, int wage_per_hour, int monthly_working_days, int monthly_working_hours){

	this.company = company;
	this.wage_per_hour = wage_per_hour;
	this.monthly_working_days = monthly_working_days;
	this.monthly_working_hours = monthly_working_hours;

	}

	public void setTotal_salary(int total_salary){
		this.total_salary = total_salary;
	}

	public String Total_emp_salary(){
		return company+ " employee total salary is : "+ total_salary;
	}
}
