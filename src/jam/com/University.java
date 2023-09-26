package jam.com;

import java.util.ArrayList;

public class University {
    ArrayList<Student> students;
    ArrayList<Course> courses;

    public University() {
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student already exists.");
            return;
        }

        students.add(student);
    }

    public void addStudents(ArrayList<Student> students) {
        for (Student student : students) {
            addStudent(student);
        }
    }

    public void removeStudent(Student student) {
        if (!students.contains(student)) {
            System.out.println("Student does not exist.");
            return;
        }

        students.remove(student);
    }

    public void removeStudents(ArrayList<Student> students) {
        for (Student student : students) {
            removeStudent(student);
        }
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already exists.");
            return;
        }

        courses.add(course);
    }

    public void addCourses(ArrayList<Course> courses) {
        for (Course course : courses) {
            addCourse(course);
        }
    }

    public void removeCourse(Course course) {
        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        courses.remove(course);
    }

    public void removeCourses(ArrayList<Course> courses) {
        for (Course course : courses) {
            removeCourse(course);
        }
    }

    public void registerStudentToCourse(Student student, Course course) {
        if (!students.contains(student)) {
            System.out.println("Student does not exist.");
            return;
        }

        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        if (!course.isAvailable()) {
            System.out.println("Course is full.");
            return;
        }

        student.addCourse(course);
        course.addStudent(student);
    }

    public void unregisterStudentFromCourse(Student student, Course course) {
        if (!students.contains(student)) {
            System.out.println("Student does not exist.");
            return;
        }

        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        if (!course.getStudentsWithinTheCourse().contains(student)) {
            System.out.println("Student is not in the course.");
            return;
        }

        student.removeCourse(course);
        course.removeStudent(student);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void reportStudents() {
        System.out.println("All students:");
        System.out.println(students);
        System.out.println("---------------------------------------------------");
    }

    public void reportCourses() {
        System.out.println("All courses:");
        System.out.println(courses);
        System.out.println("---------------------------------------------------");
    }

    public void reportStudentsWithinTheCourse() {
        System.out.println("Students within the course:");
        for (Course course : courses) {
            System.out.println(course.getTitle() + ": " + course.getStudentsWithinTheCourse());
        }
        System.out.println("---------------------------------------------------");
    }

    public void reportCoursesOfTheStudent() {
        System.out.println("Courses of the student:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getCourses());
        }
        System.out.println("---------------------------------------------------");
    }

    public void generateReports() {
        reportStudents();
        reportCourses();
        reportStudentsWithinTheCourse();
        reportCoursesOfTheStudent();
    }
}
