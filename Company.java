import employees.*;

public class Company {

    public static void main(String[] args) {

        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Oliver Doe", 50000, 0);
        employees[1] = new Worker("Jack Brown", 5000, "Tech");
        employees[2] = new Employee("Thomas Byrne", 23748);
        employees[3] = new Employee("James Murphy", 469);
        employees[4] = new Worker("Oscar Smith", 0, "Support");
        employees[5] = new Manager ("Johny Bravo", 123456, 0);
        employees[6] = new Worker("Will William", 3299, "Seller");

        for (Employee employee : employees){
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        int numberOfNonManagers = 0;
        for (Employee employee: employees){
            if(!(employee instanceof Manager)){
                numberOfNonManagers++;
            } else {
                employee.setSalary(7500);
            }
        }

        for (Employee employee : employees){
            if (employee instanceof Manager){
                ((Manager)employee).setNumberOfSubordinates(numberOfNonManagers);
            }
        }


        System.out.println("Data of all the employees: ");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }

    }

}
