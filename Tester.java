import java.util.ArrayList;
class Tester extends Employee {
    ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        testTypes = new ArrayList<>();
    }
    public void addTestType(String testType) {
        testTypes.add(testType);
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();
        salary += testTypes.size() * 300;
        return salary;
    }
}

