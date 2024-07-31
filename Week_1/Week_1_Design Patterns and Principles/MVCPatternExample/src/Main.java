public class Main {
    public static void main(String[] args) {
        Student model = new Student("101", "Raja", "O");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Aman");
        controller.setStudentGrade("E");

        controller.updateView();
    }
}
