package DesignPattern.ProxyDesignPattern;

public class AccountServiceProxy implements AccountService {
    private AccountServiceImpl accountService = new AccountServiceImpl();

    @Override
    public void create(String client, EmployeeObj employeeObj) {
        if (client.equalsIgnoreCase("ADMIN")) {
            accountService.create("ADMIN", employeeObj);
        } else {
            System.out.println("Access denied! Only admins can create accounts.");
        }

    }

    @Override
    public void delete(String client, int empId) {
        if (client.equalsIgnoreCase("ADMIN")) {
            accountService.delete("ADMIN", empId);
        } else {
            System.out.println("Access denied! Only admins can delete accounts.");
        }
    }

    @Override
    public void read() {
        accountService.read();
    }
}



