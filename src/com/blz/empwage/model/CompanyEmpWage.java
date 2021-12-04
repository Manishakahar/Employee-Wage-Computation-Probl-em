package com.blz.empwage.model;

import java.util.Arrays;

public class CompanyEmpWage {
    // Declaring Variable
    public String companyName;
    public int empWagePerHr;
    public int numMaxWorkingDay;
    public int maxHrsInMonth;
    public int totalEmpWage;
   public int[] perDayWage;

    // Constructor
    public CompanyEmpWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this. maxHrsInMonth=maxHrsInMonth;
        this.numMaxWorkingDay = numMaxWorkingDay;
        this. perDayWage = new int[numMaxWorkingDay];

    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", empWagePerHr=" + empWagePerHr +
                ", numMaxWorkingDay=" + numMaxWorkingDay +
                ", maxHrsInMonth=" + maxHrsInMonth +
                ", totalEmpWage=" + totalEmpWage +
                ", perDayWage=" + Arrays.toString(perDayWage) +
                '}';
    }
}

