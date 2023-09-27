import jam.com.Course;
import jam.com.Student;
import jam.com.University;
import jam.com.UniversityReporter;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        UniversityReporter.initializeUniversity(university);

        Student studentJamlie = new Student(977, "Jamlie", "jamlee977@outlook.com");
        Student studentOmar = new Student(420, "Omar", "omares977@outlook.com");
        Course introToProgramming1 = new Course("CS101", "Introduction to Programming 1", "Dr. Ahmed", 2);
        Course introToProgramming2 = new Course("CS102", "Introduction to Programming 2", "Dr. Ahmed", 2);

        UniversityReporter.initializeStudent(studentJamlie);
        UniversityReporter.initializeCourse(introToProgramming1);

        university.addStudent(studentJamlie);
        university.addStudent(studentOmar);
        university.addCourse(introToProgramming1);
        university.addCourse(introToProgramming2);

        university.registerStudentToCourse(studentJamlie, introToProgramming1);
        university.registerStudentToCourse(studentJamlie, introToProgramming2);
        university.registerStudentToCourse(studentOmar, introToProgramming1);
        university.registerStudentToCourse(studentOmar, introToProgramming2);

        System.out.println("After registering students to courses:");
        UniversityReporter.generateReports();

        System.out.println("----------------------------------------");

        university.unregisterStudentFromCourse(studentJamlie, introToProgramming1);
        university.unregisterStudentFromCourse(studentOmar, introToProgramming2);

        System.out.println("After unregistering students from courses:");
        UniversityReporter.generateReports();
    }
}