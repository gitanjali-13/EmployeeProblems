package com.bridgelabz.employee.wages;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("**Welcome to EMPLOYEE WAGES PROGRAM**");
        int salary ;
        int fullTime = 1;
        int partTime = 2;
        int perHrsWage = 20;
        int monthSalary = 0;
        for ( int i = 0; i <= 20; i++ ) {

            int check = (int) Math.floor(Math.random() * 10) % 2;
            switch (check) {
                case 1 :
                    System.out.println("Employee is working in part time.");
                    int Hrs = 8;
                    salary = perHrsWage * Hrs;
                    System.out.println("Salary of employee :" + salary);
                    break;
                case 2 :
                    System.out.println("Employee is working in part time.");
                    Hrs = 4;
                    salary = perHrsWage * Hrs;
                    System.out.println("Salary of employee :" + salary);
                    break;
                default:
                    System.out.println("Employee is not present!!!");
                    Hrs = 0;
                    salary = perHrsWage * Hrs;
                    System.out.println("salary for employee : " + salary);
                }
            }
        }
    }
