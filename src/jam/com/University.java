package jam.com;

import java.util.ArrayList;

/**
 * <h1>University</h1>
 */
public class University {
    /** <p>A list of students within the University</p> */
    ArrayList<Student> students;
    /** <p>A list of courses within the University</p> */
    ArrayList<Course> courses;

    public University() {
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    /**
     * <p>Adds a student to the University</p>
     * @param student The student
     */
    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student already exists.");
            return;
        }

        students.add(student);
    }

    /**
     * <p>Adds a list of students to the University</p>
     * @param students The list of students
     */
    public void addStudents(ArrayList<Student> students) {
        for (Student student : students) {
            addStudent(student);
        }
    }

    /**
     * <p>Removes a student from the University</p>
     * @param student The student
     */
    public void removeStudent(Student student) {
        if (!students.contains(student)) {
            System.out.println("Student does not exist.");
            return;
        }

        students.remove(student);
    }

    /**
     * <p>Removes a list of students from the University</p>
     * @param students The list of students
     */
    public void removeStudents(ArrayList<Student> students) {
        for (Student student : students) {
            removeStudent(student);
        }
    }

    /**
     * <p>Adds a course to the University</p>
     * @param course The course
     */
    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already exists.");
            return;
        }

        courses.add(course);
    }

    /**
     * <p>Adds a list of courses to the University</p>
     * @param courses The list of courses
     */
    public void addCourses(ArrayList<Course> courses) {
        for (Course course : courses) {
            addCourse(course);
        }
    }

    /**
     * <p>Removes a course from the University</p>
     * @param course The course
     */
    public void removeCourse(Course course) {
        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        courses.remove(course);
    }

    /**
     * <p>Removes a list of courses from the University</p>
     * @param courses The list of courses
     */
    public void removeCourses(ArrayList<Course> courses) {
        for (Course course : courses) {
            removeCourse(course);
        }
    }

    /**
     * <p>Registers a student to a course</p>
     * @param student The student
     * @param course The course
     */
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

        StudentManager.addCourseToStudent(course, student);
        CourseManager.addStudentToCourse(student, course);
    }

    /**
     * <p>Unregisters a student from the course</p>
     * @param student The students
     * @param course The course
     */
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

        StudentManager.removeCourseFromStudent(course, student);
        CourseManager.removeStudentFromCourse(student, course);
    }

    /**
     * <p>Gets the list of students within the University</p>
     * @return The list of students
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * <p>Gets the list of courses within the University</p>
     * @return The list of courses
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * <p>Reports (prints) all students within the University using the <code>report</code> method that was given by the interface <code>Reportable</code></p>
     */
    public void reportStudents() {
        System.out.println("All students:");
        System.out.print("[");
        for (var student : students) {
            student.report();
            System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Reports (prints) all courses within the University using the <code>report</code> method that was given by the interface <code>Reportable</code></p>
     */
    public void reportCourses() {
        System.out.println("All courses:");
        System.out.print("[");
        for (var student : students) {
            student.report();
            System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Reports (prints) all students who have the course</p>
     */
    public void reportStudentsWithinTheCourse() {
        System.out.println("Students within the course:");
        for (Course course : courses) {
            System.out.println(course.getTitle() + ": " + course.getStudentsWithinTheCourse());
        }
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Reports (prints) all courses of the student</p>
     */
    public void reportCoursesOfTheStudent() {
        System.out.println("Courses of the student:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getCourses());
        }
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Generates all reports</p>
     */
    public void generateReports() {
        reportCourses();
        reportStudentsWithinTheCourse();
        reportCoursesOfTheStudent();
    }
}
