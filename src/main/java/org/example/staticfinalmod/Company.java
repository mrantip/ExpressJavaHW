package org.example.staticfinalmod;

public class Company {

    static String companyName;
    final int EMPLUYEE_ID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.EMPLUYEE_ID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Имя компании " + companyName);
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

}
