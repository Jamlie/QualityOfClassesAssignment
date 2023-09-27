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
     */
    public static void addStudentToCourse(Student student, Course course) {
        if (course.getStudentsWithinTheCourse().contains(student)) {
            System.out.println("Student already exists.");
            return;
        }

        if (course.getStudentsWithinTheCourse().size() >= course.getMaxCapacity()) {
            System.out.println("Course is full.");
            return;
        }

        course.getStudentsWithinTheCourse().add(student);
        student.getCourses().add(course);
    }

    /**
     * <p>Removes a student from the course</p>
     */
    public static void removeStudentFromCourse(Student student, Course course) {
        if (!course.getStudentsWithinTheCourse().contains(student)) {
            System.out.println("Student does not exist.");
            return;
        }

        course.getStudentsWithinTheCourse().remove(student);
        student.getCourses().remove(course);
    }
}
