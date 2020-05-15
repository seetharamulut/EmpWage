package com.Empwage.service;
import com.Empwage.model.Employee;
import com.Empwage.service.Companyempwage;

public class EmpwageBuilderarray{


	private int no_of_company=0;
	private Companyempwage[] companyempwageArray;

	public EmpwageBuilderarray(){
		companyempwageArray = new Companyempwage[5];
	}
	public void addempwage(String company, int wage_per_hour, int monthly_working_days, int monthly_working_hours){
		companyempwageArray[no_of_company] = new Companyempwage(company, wage_per_hour, monthly_working_days, monthly_working_hours);
		no_of_company++;
	}

	public void Empwage_computation(){

		for(int i=0; i<no_of_company; i++){
			Emp_Salary(companyempwageArray[i]);
			System.out.println(companyempwageArray[i].Total_emp_salary());
		}
	}

        private int total_hours=0;

	Employee emp = new Employee();


        private void Emp_Salary(Companyempwage companyempwage){

		int status = 0;
		int hours = 0;
		int wage = 0;
		int total_salary = 0;

                for(int day=0; day < companyempwage.monthly_working_days && total_hours < companyempwage.monthly_working_hours; day++){

			status = (int)(Math.random()*10)%2;
			System.out.print("Day "+ (day+1) +" : ");
	                	switch (status){

        	                case 0: System.out.println("absent");
                	                emp.setStatus(false);
                        	        break;

                        	case 1: System.out.println("present");
                                	emp.setStatus(true);

					hours=(int)(((Math.random()*10)%8)+1);

					if(total_hours + hours >= companyempwage.monthly_working_hours)
                                                hours = 200 - total_hours;

                        		wage = companyempwage.wage_per_hour * hours;
					total_salary+=wage;

					if(hours == 8){
                               			System.out.println("     fulltime employee");
                              			System.out.println("     wage :"+ wage);
                                       	}
					else {
						System.out.println("     part_time employee");
						System.out.println("     wage :"+ wage);
					}

		                        emp.setDailywage(wage);
                		        total_hours+=hours;
				};
                }

		total_hours = 0;
		companyempwage.setTotal_salary(total_salary);

	}
}

