package DesignPattern.ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    List<EmployeeObj> empList = new ArrayList<>();
    public AccountServiceImpl() {
        empList.add(new EmployeeObj(101, "Shubham"));
        empList.add(new EmployeeObj(102, "Ramesh"));
    }
    @Override
    public void create(String client, EmployeeObj employeeObj) {
        System.out.println("User Created");
        empList.add(employeeObj);
    }
    @Override
    public void delete(String client, int empId) {
        boolean flag = false;
        for (EmployeeObj emp : empList) {
            if (emp.getEmpId() == empId) {
                flag = true;
                System.out.println("User Removed");
                empList.remove(emp);
            }
        }
        if(!flag){
            System.out.println("No user found");
        }
    }

    @Override
    public void read() {
        for (EmployeeObj emp : empList) {
            System.out.println("ID = "+emp.getEmpId() + " :  NAME = " + emp.getEmpName());
        }
    }
}
