package com.bridglabz;

public class EmployeePayroll {
    private int id;
    private String name;
    private int salary;

    public EmployeePayroll() {
    }

    public EmployeePayroll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}