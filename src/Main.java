import jam.com.*;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        StudentModel studentJamlieModel = new StudentModel(977, "Jamlie", "jamlee977@outlook.com");
        StudentModel studentOmarModel = new StudentModel(420, "Omar", "omares977@outlook.com");
        Student studentJamlie = new Student(studentJamlieModel);
        Student studentOmar = new Student(studentOmarModel);
        CourseModel introToProgramming1Model = new CourseModel("CS101", "Introduction to Programming 1", "Dr. Ahmed", 2);
        CourseModel introToProgramming2Model = new CourseModel("CS102", "Introduction to Programming 2", "Dr. Ahmed", 2);
        Course introToProgramming1 = new Course(introToProgramming1Model);
        Course introToProgramming2 = new Course(introToProgramming2Model);

        university.addStudent(studentJamlie);
        university.addStudent(studentOmar);
        university.addCourse(introToProgramming1);
        university.addCourse(introToProgramming2);

        university.registerStudentToCourse(studentJamlie, introToProgramming1);
        university.registerStudentToCourse(studentJamlie, introToProgramming2);
        university.registerStudentToCourse(studentOmar, introToProgramming1);
        university.registerStudentToCourse(studentOmar, introToProgramming2);

       System.out.println("After registering students to courses:");
       UniversityReporter.generateReports(university, studentJamlie, introToProgramming1);

       System.out.println("----------------------------------------");

       university.unregisterStudentFromCourse(studentJamlie, introToProgramming1);
       university.unregisterStudentFromCourse(studentOmar, introToProgramming2);

       System.out.println("After unregistering students from courses:");
       UniversityReporter.generateReports(university, studentJamlie, introToProgramming1);
    }
}
