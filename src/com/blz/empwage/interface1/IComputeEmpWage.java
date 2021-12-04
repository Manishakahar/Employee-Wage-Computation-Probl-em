package com.blz.empwage.interface1;

public interface IComputeEmpWage {
     void  addCompanyEmpWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth);
     void computeEmpWageFromArray();
     int getTotalEmpWage(String companyName);

}
