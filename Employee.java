import java.util.ArrayList;
class Employee {
    String firstName;
    String lastName;
    String address;
    String email;
    String pesel;
    int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorked = 2024 - yearOfEmployment;
        return baseSalary + (yearsWorked * 1000);
    }
}

