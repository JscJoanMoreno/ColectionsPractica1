package Student;

public class Student {
    private String idStudent;
    private String name;
    private int age;

    public Student(String idStudent, String name, int age) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ID: " + idStudent + ", Name: " + name + ", Age: " + age;
    }
}
