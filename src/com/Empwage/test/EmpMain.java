package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.Iempservice;
import com.Empwage.service.Abcompany;
import com.Empwage.service.Xyzcompany;
import com.Empwage.service.Mnocompany;

public class EmpMain{

        public static void main(String[] args) {

		Iempservice Iempservice = new Abcompany();
		Employee emp = new Employee();

		Iempservice.EmpSalary(emp, "Reliance", 18, 14, 120);
		
        }
}
