package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.EmpwageBuilder;

public class EmpMain{

        public static void main(String[] args) {
		System.out.println("welcome to employee wage computation");

		EmpwageBuilder Dmart = new EmpwageBuilder("Dmart", 20, 21, 100);
		Dmart.EmpSalary();
		System.out.println("      ");
		EmpwageBuilder Tata = new EmpwageBuilder("Tata", 21, 24, 120);
                Tata.EmpSalary();

        }
}
