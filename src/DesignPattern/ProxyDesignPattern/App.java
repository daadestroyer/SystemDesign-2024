package DesignPattern.ProxyDesignPattern;

public class App {

    public static void main(String[] args) {
        AccountServiceProxy accountServiceProxy = new AccountServiceProxy();
        // admin can only call create api

        // User Created
        accountServiceProxy.create("ADMIN",new EmployeeObj(103,"Pankaj"));

        // Access denied! Only admins can create accounts.
        accountServiceProxy.create("USER",new EmployeeObj(104,"Rekha"));

        // User Removed
        accountServiceProxy.delete("ADMIN",102);

        // No user found
        accountServiceProxy.delete("ADMIN",1022);

        // Access denied! Only admins can delete accounts.
        accountServiceProxy.delete("USER",103);

        System.out.println();

        // anyone can call read api
        accountServiceProxy.read();
    }
}


