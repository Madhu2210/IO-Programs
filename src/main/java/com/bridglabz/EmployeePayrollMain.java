package com.bridglabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollMain {
    private List<EmployeePayroll> employeePayrollList = new ArrayList<>();

    public EmployeePayrollMain(List<EmployeePayroll> employeePayrollList) {
    }


    //  main() method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service");
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayrollMain employeePayrollMain = new EmployeePayrollMain(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollMain.readEmployeePayroll(consoleInputReader);
        employeePayrollMain.writeEmployeePayroll();
    }

    // read method
    private void readEmployeePayroll(Scanner consoleInputReader) {
        System.out.println("Enter Employee Id");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary");
        int salary = consoleInputReader.nextInt();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }

    // write method
    private void writeEmployeePayroll() {
        System.out.println("\n Writing Employee Payroll Roster to Console\n" + employeePayrollList);
    }
}
