public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        String[] taskID = {"T101", "T102", "T103", "T104", "T105"};
        String[] taskName = {"Reading", "Jogging", "Coding", "Homework", "Resting"};
        String[] status = {"Completed", "Pending", "Completed", "Pending", "Pending"};

        for (int i = 0; i < taskID.length; i++) {
            ll.addTask(new Task(taskID[i], taskName[i], status[i]));
        }

        ll.traverseTasks();

        Task search = ll.searchTask("T101");
        System.out.println(search != null ? "Task found " + search : "Task not found!");

        Task delete = ll.deleteTask("T104");
        System.out.println(delete != null ? "Task deleted " + delete : "Task not found!");
    }
}