package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public List<Employee> getAllEmployees(){
        return employees;
    }
    /**
     * Метод для поиска сотрудников по опыту работы.
     * @param experience требуемый опыт работы
     * @return список сотрудников с указанным опытом работы
     */
    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }
    /**
     * Метод для поиска номеров телефонов сотрудников по имени.
     * @param name имя сотрудника
     * @return список номеров телефонов сотрудников с указанным именем
     */
    public List<String> findPhoneNumbersByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }
    /**
     * Метод для поиска сотрудника по идентификатору.
     * @param employeeID идентификатор сотрудника
     * @param employeeList список сотрудников, в котором производится поиск
     * @return найденный сотрудник или null, если сотрудник не найден
     */
    public static Employee findEmployeeByID(int employeeID, List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null;
    }
}
