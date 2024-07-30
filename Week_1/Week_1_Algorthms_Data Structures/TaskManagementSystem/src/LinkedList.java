public class LinkedList {
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task.getTaskId() + ": " + current.task.getTaskName() + " - " + current.task.getStatus());
            current = current.next;
        }
    }

    public Task deleteTask(String taskId) {
        if (head == null) return null;

        if (head.task.getTaskId().equals(taskId)) {
            Task deleted = head.task;
            head = head.next;
            return deleted;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next == null) {
            return null;
        } else {
            Task deleted = current.next.task;
            current.next = current.next.next;
            return deleted;
        }
    }

    @Override
    public String toString() {
        return "Task List";
    }
}
