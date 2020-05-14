package com.Empwage.service;
import com.Empwage.model.Employee;

public class Empservice{


	public boolean EmpStatus(Employee emp){

                int status = (int)(Math.random()*10)%2;
                if(status == 1){
                emp.setStatus(true);
                return true;
                }
                else{
                emp.setStatus(false);
                return false;
                }
        }

	public void EmpDailywage(Employee emp){

		boolean status=emp.getStatus();
		if(status == true){
		emp.setDailywage(20*(int)(((Math.random()*10)%8)+1));
		}

	}
}
