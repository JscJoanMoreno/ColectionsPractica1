package Student;

public class CourseManagerTest {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        manager.enrollStudent(new Student("S001", "Alice", 20));
        manager.enrollStudent(new Student("S002", "Bob", 22));
        manager.enrollStudent(new Student("S003", "Charlie", 21));

        System.out.println("\nList of all students:");
        manager.listAllStudents();

        System.out.println("\nFinding student with ID 'S002':");
        System.out.println(manager.findStudentById("S002"));

        System.out.println("\nUnenrolling student with ID 'S001'");
        manager.unenrollStudent("S001");

        System.out.println("\nList of students after unenrollment:");
        manager.listAllStudents();
    }
}
