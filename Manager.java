import java.util.ArrayList;
import java.util.Calendar;
class Manager extends Employee {
    ArrayList<Goal> goals;
    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        goals = new ArrayList<>();
    }
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();
        int currentYear = 2024;
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        for (Goal goal : goals) {
            if (goal.getYear() == currentYear && goal.getMonth() == currentMonth) {
                salary += goal.getBonus();
            }
        }
        return salary;
    }
}

