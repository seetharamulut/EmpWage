package com.Empwage.service;
import com.Empwage.model.Employee;
import com.Empwage.service.Iempservice;

public class Abcompany implements Iempservice{

        private boolean status;
        private int wage=0;
        private int hours=0;
        private int total_hours=0;
        private int salary =0;
        private final int hour_wage=20;
        private final int monthly_days=20;
        private final int monthly_hours=100;

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
                        total_hours+=hours;
                        /*if(hours == 8)
                                System.out.println("full time wage is : "+ wage);
                        else
                                System.out.println("part time wage is : "+ wage);*/
                }

        }

        public void EmpSalary(Employee emp){

                for(int i=0; i < monthly_days && total_hours < monthly_hours; i++){
                        EmpStatus(emp);
                        status = emp.getStatus();

                        if(status == true){
                                EmpDailywage(emp);
                                salary += emp.getDailywage();
                        }
                }
                if(total_hours < 100)
                        emp.setSalary(salary);
                else
                        emp.setSalary(monthly_hours * hour_wage);

                System.out.println("total salary of employee is : "+ emp.getSalary());
        }
}
