package com.Empwage.model;
public class Employee{


        private boolean status;
	private int dailywage;

        public boolean getStatus(){
                return status;
        }
        public void setStatus(boolean status){
                this.status=status;
        }
	public int getDailywage(){
//System.out.println("js"+ dailywage);
                return dailywage;
        }
        public void setDailywage(int wage){
                this.dailywage=wage;
//System.out.println(dailywage);
        }

}
