package com.Empwage.model;
public class Employee{


        private boolean status;
	private int dailywage;
	private int salary;
	
        public boolean getStatus(){
                return status;
        }

        public void setStatus(boolean status){
                this.status=status;
        }

	public int getDailywage(){
                return dailywage;
        }

        public void setDailywage(int wage){
                this.dailywage=wage;
        }
	public int getSalary(){
                return salary;
        }

        public void setSalary(int salary){
                this.salary=salary;
        }


}
