import java.util.Arrays;

public class EmployeeManagement {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagement(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean addEmployee(Employee employee) {
        if (size == capacity) {
            System.out.println("Array is full. Cannot add more employees.");
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " - " + employees[i].getPosition() + " - " + employees[i].getSalary());
        }
    }

    public Employee deleteEmployee(String employeeId) {
        Employee deleted = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                deleted = employees[i];
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return deleted;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Total employees: " + getSize();
    }
}
