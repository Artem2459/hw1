import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

// Клас, що представляє оцінку студента
class Grade {
    private Student student;
    private String subject;
    private double grade;

    public Grade(Student student, String subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }
}

// Клас, що управляє студентами та їх оцінками
class StudentManager {
    private List<Student> students;
    private Map<Student, List<Grade>> grades;

    public StudentManager() {
        students = new ArrayList<>();
        grades = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        grades.put(student, new ArrayList<>());
    }

    public void addGrade(Student student, String subject, double grade) {
        List<Grade> studentGrades = grades.get(student);
        if (studentGrades != null) {
            studentGrades.add(new Grade(student, subject, grade));
        }
    }

    public double getAverageGrade(Student student) {
        List<Grade> studentGrades = grades.get(student);
        if (studentGrades == null || studentGrades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Grade grade : studentGrades) {
            sum += grade.getGrade();
        }
        return sum / studentGrades.size();
    }
}

public class hw9 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // Додавання студентів
        Student student1 = new Student("John", 1, 20);
        Student student2 = new Student("Emily", 2, 21);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Додавання оцінок
        studentManager.addGrade(student1, "Math", 90.0);
        studentManager.addGrade(student1, "Physics", 85.0);
        studentManager.addGrade(student2, "Math", 88.0);
        studentManager.addGrade(student2, "Physics", 92.0);

        // Виведення середнього балу для кожного студента
        System.out.println("Average grade for " + student1.getName() + ": " + studentManager.getAverageGrade(student1));
        System.out.println("Average grade for " + student2.getName() + ": " + studentManager.getAverageGrade(student2));
    }
}
