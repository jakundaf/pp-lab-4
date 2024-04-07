import employees.*;
public class Company {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Oliver Doe", 50000, 0);
        employees[1] = new Worker("Jack Brown", 5000, "Tech");
        employees[2] = new Employee("Thomas Byrne", 23748);
        employees[3] = new Employee("James Murphy", 469);
        employees[4] = new Worker("Oscar Smith", 0, "Support");

        System.out.println("Date of all the employees: ");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }

    }

}
