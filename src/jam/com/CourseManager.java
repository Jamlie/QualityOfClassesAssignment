package jam.com;

/**
 * <h1>CourseManager</h1>
 * <p>Manages the courses' students</p>
 */
public class CourseManager {
    /** <p>Private constructor to prevent instantiation</p> */
    private CourseManager() {}

    /**
     * <p>Adds a student to the course</p>
     * @param student The student to be added
     *                <p>Precondition: The student does not exist in the course</p>
     * @param course The course to add the student to
     *               <p>Precondition: The course has not reached the maximum number of students</p>
     */
    public static void addStudentToCourse(Student student, Course course) {
        if (isStudentInCourse(student, course)) {
            System.out.println("Student already exists.");
            return;
        }

        if (course.isFull()) {
            System.out.println("Course is full.");
            return;
        }

        course.getStudentsWithinTheCourse().add(student);
    }

    /**
     * <p>Removes a student from the course</p>
     * @param student The student to be removed
     *                <p>Precondition: The student exists in the course</p>
     * @param course The course to remove the student from
     *               <p>Precondition: The course has not reached the minimum number of students</p>
     */
    public static void removeStudentFromCourse(Student student, Course course) {
        if (!isStudentInCourse(student, course)) {
            System.out.println("Student does not exist.");
            return;
        }

        course.getStudentsWithinTheCourse().remove(student);
    }

    /**
     * <p>Checks if a student is in a course</p>
     * @param student The student to check
     * @param course The course to check
     * @return True if the student is in the course, false otherwise
     */
    private static boolean isStudentInCourse(Student student, Course course) {
        return course.getStudentsWithinTheCourse().contains(student);
    }
}
