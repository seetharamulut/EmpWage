package com.Empwage.service;

public interface Iwagecomputation{

	public void addempwage(String company, int wage_per_hour, int monthly_working_days, int monthly_working_hours);

	public void computeEmpwage();

	public int getTotalwage(String company);
}
