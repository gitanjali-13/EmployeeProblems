package com.bridgelabz.employee.wages;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("**Welcome to EMPLOYEE WAGES PROGRAM**");
        int fullTime = 1;
        int perHrsWage = 20;
        double check = Math.floor(Math.random() * 10 ) % 2;
        if ( check == fullTime ) {
            System.out.println("Employee is present.");
        }else {
            System.out.println("Employee is not present.");
        }
    }
}
