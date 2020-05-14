package com.Empwage.service;
import com.Empwage.model.Employee;

public class Empservice{

	Employee emp = new Employee();

	public boolean EmpStatus(){

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
}
