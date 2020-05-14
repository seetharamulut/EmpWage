package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.Empservice;

public class EmpMain{

        public static void main(String[] args) {

		Empservice empservice = new Empservice();
		Employee emp = new Employee();

		boolean status = empservice.EmpStatus(emp);
		empservice.EmpDailywage(emp);

        }
}
