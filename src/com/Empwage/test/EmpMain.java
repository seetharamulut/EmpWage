package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.Empservice;

public class EmpMain{

        public static void main(String[] args) {

		Empservice empservice = new Empservice();
		Employee emp = new Employee();

		boolean status = empservice.EmpStatus(emp);

                if(status == true)
                        System.out.println("present");
                else
                        System.out.println("absent");


		empservice.EmpDailywage(emp);
		System.out.println("employee daily wage is : "+ emp.getDailywage());

        }
}
