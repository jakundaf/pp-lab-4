package employees;

public class Manager extends Employee {

    public int numberOfSubordinates;

    @Override
    public String getName() {
        return super.getName();
    }

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "fullName'" + getName() +
                "', salary=" + getSalary() +
                ", Subordinates=" + numberOfSubordinates +
                "'}";
    }
}
