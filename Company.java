public class Company {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Oliver Doe", 50000);
        employees[1] = new Employee("Jack Brown", 5000);
        employees[2] = new Employee("Thomas Byrne", 23748);
        employees[3] = new Employee("James Murphy", 469);
        employees[4] = new Employee("Oscar Smith", 0);

        System.out.println("Data of employee index 3:" );
        System.out.println(employees[3]);

        employees[3].setSalary(1111);

        System.out.println("Date of all the employees: ");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }

    }

}
