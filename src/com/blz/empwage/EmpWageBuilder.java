package com.blz.empwage;

public class EmpWageBuilder {
    // Declaring Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR = 4;
    // Declaring Variable
    private static String companyName;
    private static int empWagePerHr;
    private static int numMaxWorkingDay;
    private static int maxHrsInMonth;
    private static int totalEmpWage;

    // Constructor
    public EmpWageBuilder(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this.numMaxWorkingDay = numMaxWorkingDay;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    @Override
    public String toString() {
        return "Total EmpWAge for " + companyName + "  " + totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageBuilder dMartEmpWage = new EmpWageBuilder("dMart", 20, 20, 100);
        dMartEmpWage.computeEmpWage();
        System.out.println(dMartEmpWage);
        EmpWageBuilder tcsEmpWage = new EmpWageBuilder("tcs", 16, 20, 100);
        tcsEmpWage.computeEmpWage();
        System.out.println(tcsEmpWage);
    }

    private void computeEmpWage() {
        int totalEmpHours = 0, totalWorkingDays = 0, workingHours = 0;
        while (totalEmpHours < maxHrsInMonth && totalWorkingDays < numMaxWorkingDay) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            // Calculating Wage On Employee Type
            switch ((int) empCheck) {
                case 0:
                    workingHours = FULL_DAY_HR;
                    break;
                case 1:
                    workingHours = PART_DAY_HR;
                    break;
                default:
                    workingHours = 0;
            }
            totalEmpHours += workingHours;
            System.out.println("Day: " + totalWorkingDays + " workingHours: " + workingHours);
        }
        //Calculate Employ wage
        totalEmpWage = totalEmpHours * empWagePerHr;
    }
}