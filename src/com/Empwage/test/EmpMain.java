package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.Iempservice;
import com.Empwage.service.Abcompany;

public class EmpMain{

        public static void main(String[] args) {

		Iempservice Iempservice = new Abcompany();
		Employee emp = new Employee();

		//Iempservice.EmpStatus(emp);
		//Iempservice.EmpDailywage(emp);
		Iempservice.EmpSalary(emp);
        }
}
