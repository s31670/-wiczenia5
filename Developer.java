import java.util.ArrayList;
class Developer extends Employee {
    ArrayList<Technology> technologies;
    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();
        for (Technology tech : technologies) {
            salary += tech.getBonus();
        }
        return salary;
    }
}

