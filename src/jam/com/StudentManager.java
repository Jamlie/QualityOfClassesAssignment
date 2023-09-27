package jam.com;

/**
 * <h1>StudentManager</h1>
 * <p>Manages the students' courses</p>
 */
public class StudentManager {
    /** <p>Private constructor to prevent instantiation</p> */
    private StudentManager() {}

    /**
     * <p>Adds a course to the student's courses</p>
     */
    public static void addCourseToStudent(Course course, Student student) {
        if (student.getCourses().contains(course)) {
            System.out.println("Course already exists.");
            return;
        }

        if (student.getCourses().size() >= 5) {
            System.out.println("Student has reached the maximum number of courses.");
            return;
        }

        student.getCourses().add(course);
        course.getStudentsWithinTheCourse().add(student);
    }

    /**
     * <p>Removes a course from the student's courses</p>
     */
    public static void removeCourseFromStudent(Course course, Student student) {
        if (!student.getCourses().contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        student.getCourses().remove(course);
        course.getStudentsWithinTheCourse().remove(student);
    }
}
