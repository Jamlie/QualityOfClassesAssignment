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
     * @param course The course to be added
     *               <p>Precondition: The course does not exist in the student's courses</p>
     * @param student The student to add the course to
     *                <p>Precondition: The student has not reached the maximum number of courses</p>
     */
    public static void addCourseToStudent(Course course, Student student) {
        if (doesStudentHaveCourse(student, course)) {
            System.out.println("Course already exists.");
            return;
        }

        if (doesCourseHaveStudent(course, student)) {
            System.out.println("Student already exists.");
            return;
        }

        student.getCourses().add(course);
    }

    /**
     * <p>Removes a course from the student's courses</p>
     * @param course The course to be removed
     *               <p>Precondition: The course exists in the student's courses</p>
     * @param student The student to remove the course from
     *                <p>Precondition: The student has not reached the minimum number of courses</p>
     */
    public static void removeCourseFromStudent(Course course, Student student) {
        if (!doesStudentHaveCourse(student, course)) {
            System.out.println("Course does not exist.");
            return;
        }

        student.getCourses().remove(course);
    }

    /**
     * <p>Checks if the student has the course</p>
     * @param student The student to check
     * @param course The course to check
     * @return True if the student has the course, false otherwise
     */
    private static boolean doesStudentHaveCourse(Student student, Course course) {
        return student.getCourses().contains(course);
    }

    /**
     * <p>Checks if the course has the student</p>
     * @param course The course to check
     * @param student The student to check
     * @return True if the course has the student, false otherwise
     */
    private static boolean doesCourseHaveStudent(Course course, Student student) {
        return course.getStudentsWithinTheCourse().contains(student);
    }
}
