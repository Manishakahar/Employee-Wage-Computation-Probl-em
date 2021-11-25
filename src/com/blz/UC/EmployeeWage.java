package com.blz.UC;

public class EmployeeWage {
    public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR =4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int empHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
       // if (empCheck == IS_FULL_TIME ){
       //     empHrs= FULL_DAY_HR;
       // }
       // else if (empCheck== IS_PART_TIME){
         //   empHrs= PART_DAY_HR;
       // }
             switch ((int)empCheck){
                 case IS_PART_TIME:
                     empHrs = PART_DAY_HR;
                     break;
                 case IS_FULL_TIME:
                     empHrs= FULL_DAY_HR;
                     break;
                 default:
                     empHrs =0;
             }

         int empWage = empHrs * EMP_WAGE_PER_HR;
        System.out.println("Emp Wage" + empWage);

    }
}
