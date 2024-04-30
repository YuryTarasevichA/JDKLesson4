package HomeWork;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        Employee employee1 = new Employee(1, "1234567890", "Alice", 5);
        Employee employee2 = new Employee(2, "9876543210", "Bob", 3);
        Employee employee3 = new Employee(3, "5556667777", "Charlie", 7);

        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);
        List<Employee> allEmployees = directory.getAllEmployees();

        System.out.println("Список сотрудников:");
        for (Employee employee : allEmployees) {
            System.out.println(employee.getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стаж сотрудника: ");
        int experience = scanner.nextInt();
        List<Employee> employeesWithExperience = directory.findEmployeesByExperience(experience);
        if (!employeesWithExperience.isEmpty()) {
            System.out.println("Сотрудник со стажем " + experience + " лет: ");
            for (Employee employee : employeesWithExperience) {
                System.out.println(employee.getName());
            }
        } else System.out.println("Такого сотрудника не существует!");

        System.out.println("Введите имя сотрудника:");
        String name = scanner.next();
        List<String> phoneNumberFor = directory.findPhoneNumbersByName(name);
        if (!phoneNumberFor.isEmpty()) {
            System.out.println("\nНомер сотрудника " + name + ":");
            for (String phoneNumber : phoneNumberFor) {
                System.out.println(phoneNumber);
            }
        } else System.out.println("Такого сотрудника не существует!");

        System.out.println("Введите ID сотрудника:");
        int id = scanner.nextInt();
        Employee foundEmployee = EmployeeDirectory.findEmployeeByID(id, directory.getAllEmployees());
        if (foundEmployee != null) {
            System.out.println("\nСотрудник с " + id + " найден: " + foundEmployee.getName());
        } else {
            System.out.println("\nСотрудника с "+ id + "не существует!");
        }
    }
}