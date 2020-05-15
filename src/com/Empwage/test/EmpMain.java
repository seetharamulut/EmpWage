package com.Empwage.test;
import com.Empwage.model.Employee;
import com.Empwage.service.EmpwageBuilderarray;

public class EmpMain{

        public static void main(String[] args) {
		System.out.println("welcome to employee wage computation");

		EmpwageBuilderarray empwagebuilderarray = new EmpwageBuilderarray();
		empwagebuilderarray.addempwage("Dmart", 20, 21, 100);
		empwagebuilderarray.addempwage("Reliance", 18, 24, 120);
		empwagebuilderarray.addempwage("Tata", 22, 25, 125);
		empwagebuilderarray.Empwage_computation();
        }
}
