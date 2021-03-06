package com.blz.empwage.service;

import com.blz.empwage.interface1.IComputeEmpWage;
import com.blz.empwage.model.CompanyEmpWage;
import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements IComputeEmpWage {
    // Declaring Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR = 4;

    List<CompanyEmpWage> companyEmpWageList = new ArrayList();

    public static void main(String[] args) {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("TCS", 20, 4, 10);
        empWageBuilder.addCompanyEmpWage("dMart", 20, 14, 20);
        empWageBuilder.computeEmpWageFromArray();
        System.out.println(" Total Wage " +empWageBuilder. getTotalEmpWage("dMart"));
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, workingHours = 0;
        int index = 0;
        while (totalEmpHours < companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numMaxWorkingDay) {
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
            companyEmpWage.perDayWage[totalWorkingDays] = workingHours * companyEmpWage .empWagePerHr;
            totalWorkingDays++;
        }
        return totalEmpHours * companyEmpWage.empWagePerHr;
    }

    @Override
    public void addCompanyEmpWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth) {
        CompanyEmpWage empWage = new CompanyEmpWage(companyName, empWagePerHr, numMaxWorkingDay, maxHrsInMonth);
        companyEmpWageList.add(empWage);
    }

    @Override
    public void computeEmpWageFromArray() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            int totalWage = computeEmpWage(companyEmpWageList.get(i));
            companyEmpWageList.get(i).totalEmpWage = totalWage;
            System.out.println(companyEmpWageList.get(i));
        }
    }

    @Override
    public int getTotalEmpWage(String companyName) {
        for (int i = 0; i < companyEmpWageList.size(); i++){
             if (companyEmpWageList.get(i).companyName.equals(companyName)){
                 return companyEmpWageList.get(i) .totalEmpWage;
             }
        }
        return  0 ;
    }
}


