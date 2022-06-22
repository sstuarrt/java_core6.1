package com.company.java_core.homework5.task2;

public class SalaryHour implements Salary{
    public double salary_hour;

    @Override
    public void salary(double salary_hour) {
        double salary_year = salary_hour * 8 * 249;
        System.out.println("Employee`s yearly salary (per hour): " + salary_year);
    }
}
