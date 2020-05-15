package com.Empwage.service;
import com.Empwage.model.Employee;

public class EmpwageBuilder{

	private final String company;
	private final int wage_per_hour;
	private final int monthly_working_days;
	private final int monthly_working_hours;
	private int total_salary=0;

	public EmpwageBuilder(String company, int wage_per_hour, int monthly_working_days, int monthly_working_hours){

	this.company = company;
	this.wage_per_hour = wage_per_hour;
	this.monthly_working_days = monthly_working_days;
	this.monthly_working_hours = monthly_working_hours;

	System.out.println(company +"  employee salary");
	}

        private int total_hours=0;

	Employee emp = new Employee();

        public void EmpStatus(){

                int status = (int)(Math.random()*10)%2;
                switch (status){

                        case 0: System.out.println("absent");
                                emp.setStatus(false);
				break;

                        case 1: System.out.println("present");
                                emp.setStatus(true);
                };
        }

        public void EmpDailywage(){

		int wage=0;
		int hours=0;

                if(emp.getStatus() == true){
                	hours=(int)(((Math.random()*10)%8)+1);

			wage = wage_per_hour * hours;
			if(total_hours + hours >= monthly_working_hours)
				hours = 200 - total_hours;
			switch(hours){
				case 8:	System.out.println("     fulltime employee");
					System.out.println("     wage :"+ wage);
					break;

		                default :  System.out.println("     part_time employee");
                                        System.out.println("      wage :"+ wage);
			};
			emp.setDailywage(wage);
                        total_hours+=hours;
                }

        }

        public void EmpSalary(){


                for(int day=0; day < monthly_working_days && total_hours < monthly_working_hours; day++){
			System.out.print("Day : "+ (day+1));
			EmpStatus();

                        if(emp.getStatus() == true){
                                EmpDailywage();
                                total_salary += emp.getDailywage();
                        }
                }
                if(total_hours >= monthly_working_hours)
                        total_salary = monthly_working_hours * wage_per_hour;

                System.out.println("  employee salary is : "+ total_salary);
		total_hours = 0;
        }
}
