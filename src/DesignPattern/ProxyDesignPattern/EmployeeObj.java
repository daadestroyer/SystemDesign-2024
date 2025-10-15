package DesignPattern.ProxyDesignPattern;


public class EmployeeObj {

    int empId;
    String empName;

    public EmployeeObj(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
