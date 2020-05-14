package com.Empwage.service;
import com.Empwage.model.Employee;

public interface Iempservice {

	public void EmpStatus(Employee emp);
	public void EmpDailywage(Employee emp, int hour_wage);
	public void EmpSalary(Employee emp, String name , int hour_wage, int monthly_days, int monthly_hours);
}
