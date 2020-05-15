package com.Empwage.service;
import com.Empwage.model.Employee;
import com.Empwage.service.Iempservice;

public class Abcompany implements Iempservice{

        private boolean status;
        private int wage=0;
        private int hours=0;
        private int total_hours=0;
        private int salary =0;

        public void EmpStatus(Employee emp){

                int status = (int)(Math.random()*10)%2;
                switch (status){

                        case 0:
                                emp.setStatus(false);

                        case 1:
                                emp.setStatus(true);
                };
        }

        public void EmpDailywage(Employee emp, int hour_wage){

                status=emp.getStatus();

                if(status == true){
                        hours=(int)(((Math.random()*10)%8)+1);
                        wage = hour_wage * hours;
                        emp.setDailywage(wage);
                        total_hours+=hours;
                }

        }

        public void EmpSalary(Employee emp,String name, int hour_wage, int monthly_days, int monthly_hours){


                for(int i=0; i < monthly_days && total_hours < monthly_hours; i++){
                        EmpStatus(emp);
                        status = emp.getStatus();

                        if(status == true){
                                EmpDailywage(emp, hour_wage);
                                salary += emp.getDailywage();
                        }
                }
                if(total_hours < 100)
                        emp.setSalary(salary);
                else
                        emp.setSalary(monthly_hours * hour_wage);

		total_hours=0;
		System.out.print(name);
                System.out.println("  employee salaryis : "+ emp.getSalary());
        }
}
