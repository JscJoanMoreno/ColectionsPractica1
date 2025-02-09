package Student;

import java.util.HashMap;

public class CourseManager {
    private HashMap<String, Student> students = new HashMap<>();

    public void enrollStudent(Student student) {
        if (!students.containsKey(student.getIdStudent())) {
            students.put(student.getIdStudent(), student);
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Error: Student ID already exists.");
        }
    }

    public void unenrollStudent(String id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student unenrolled successfully.");
        } else {
            System.out.println("Error: Student ID not found.");
        }
    }

    public Student findStudentById(String id) {
        return students.getOrDefault(id, null);
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            students.values().forEach(System.out::println);
        }
    }
}
