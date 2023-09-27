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
        students = new ArrayList<>();
        courses = new ArrayList<>();
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
}
