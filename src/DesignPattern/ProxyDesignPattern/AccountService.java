package DesignPattern.ProxyDesignPattern;

public interface AccountService {
    void create(String client,EmployeeObj employeeObj);
    void delete(String client,int empId);
    void read();
}
