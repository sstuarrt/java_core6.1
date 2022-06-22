package com.company.java_core.homework5.task2;

public class SalaryMonth implements Salary{
    public double salary_month;

    @Override
    public void salary(double salary_month){
        double salary_year = salary_month * 12;
        System.out.println("Employee`s yearly salary (per month): " + salary_year);
    }
}
