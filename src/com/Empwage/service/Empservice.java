package com.Empwage.service;
import com.Empwage.model.Employee;

public class Empservice{


	public boolean EmpStatus(Employee emp){

                int status = (int)(Math.random()*10)%2;
                if(status == 1){
			System.out.println("present");
                	emp.setStatus(true);
                	return true;
                }
                else{
			System.out.println("absent");
                	emp.setStatus(false);
                	return false;
                }
        }

	public void EmpDailywage(Employee emp){

		int wage=0;
		boolean status=emp.getStatus();
		if(status == true){
			wage=20*(int)(((Math.random()*10)%8)+1);
			emp.setDailywage(wage);
			System.out.println("dailywage is : "+ wage);
		}

	}
}
