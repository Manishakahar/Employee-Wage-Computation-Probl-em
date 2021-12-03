package com.blz.empwage.model;

public class CompanyEmpWage {
    // Declaring Variable
    public String companyName;
    public int empWagePerHr;
    public int numMaxWorkingDay;
    public int maxHrsInMonth;
    public int totalEmpWage;

    // Constructor
    public CompanyEmpWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this.numMaxWorkingDay = numMaxWorkingDay;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", empWagePerHr=" + empWagePerHr +
                ", numMaxWorkingDay=" + numMaxWorkingDay +
                ", maxHrsInMonth=" + maxHrsInMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}

