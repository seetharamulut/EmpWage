package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.Empservice;

public class EmpMain{

        public static void main(String[] args) {

		Empservice empservice = new Empservice();

		boolean status = empservice.EmpStatus();

                if(status == true)
                        System.out.println("present");
                else
                        System.out.println("absent");
        }
}
