public class Main {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(5);

        String[] id = {"E101", "E102", "E103", "E104", "E105"};
        String[] name = {"Raju", "Sai", "Vidya", "Rahul", "Ayu"};
        String[] position = {"Jr. Software Dev.", "Sr. Software Dev.", "HR", "Jr. Manager", "Sr. Manager"};
        double[] salary = {40000, 60000, 70000, 90000, 110000};

        for (int i = 0; i < id.length; i++) {
            em.addEmployee(new Employee(id[i], name[i], position[i], salary[i]));
        }

        em.traverseEmployees();

        Employee search = em.searchEmployee("E103");
        System.out.println(search != null ? "Found " + search : "Not Found!");

        Employee del = em.deleteEmployee("E104");
        System.out.println(del != null ? "Deleted " + del : "Employee not found!");
    }
}