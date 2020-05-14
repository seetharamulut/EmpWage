package com.Empwage.service;
import com.Empwage.model.Employee;

public class Empservice{


	public boolean EmpStatus(Employee emp){

                int status = (int)(Math.random()*10)%2;
                switch (status){

			case 0: System.out.println("absent");
	                        emp.setStatus(false);
        	                return false;

			case 1: System.out.println("present");
                		emp.setStatus(true);
                		return true;
        	};
		return false;
	}

	public void EmpDailywage(Employee emp){

		int wage=0;
		int hours=0;
		final int hour_wage = 20;
		boolean status=emp.getStatus();

		if(status == true){
			hours=(int)(((Math.random()*10)%8)+1);
			wage = hour_wage * hours;
			emp.setDailywage(wage);

			if(hours == 8)
				System.out.println("full time wage is : "+ wage);
			else
				System.out.println("part time wage is : "+ wage);
		}

	}
}
