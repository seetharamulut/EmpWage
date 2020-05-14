package com.Empwage.service;
import com.Empwage.model.Employee;

public class Empservice{

	private boolean status;
	private int wage=0;
        private int hours=0;
	private int salary =0;
        private final int hour_wage=20;
	private final int monthly_days=20;

	public void EmpStatus(Employee emp){

                int status = (int)(Math.random()*10)%2;
                switch (status){

			case 0: //System.out.println("absent");
	                        emp.setStatus(false);

			case 1: //System.out.println("present");
                		emp.setStatus(true);
        	};
	}

	public void EmpDailywage(Employee emp){

		status=emp.getStatus();

		if(status == true){
			hours=(int)(((Math.random()*10)%8)+1);
			wage = hour_wage * hours;
			emp.setDailywage(wage);

			/*if(hours == 8)
				System.out.println("full time wage is : "+ wage);
			else
				System.out.println("part time wage is : "+ wage);*/
		}

	}

	public void EmpSalary(Employee emp){

		for(int i=0; i < monthly_days; i++){
 			EmpStatus(emp);
			status = emp.getStatus();

			if(status == true){
				EmpDailywage(emp);
	                        salary += emp.getDailywage();
			}
		}
		emp.setSalary(salary);
		System.out.println("total salary of employee is : "+ salary);
	}
}
