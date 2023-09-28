package jam.com;

/**
 * <h1>UniversityReporter</h1>
 * <p>A UniversityReporter is used to generate reports off a given university via initializeUniversity</p>
 */
public class UniversityReporter {
    private UniversityReporter() {}

    private static University university;
    private static Student student;
    private static Course course;

    /**
     * <p>Initializes UniversityReporter.university</p>
     * @param university The university
     */
    public static void initializeUniversity(University university) {
        UniversityReporter.university = university;
    }

    /**
     * <p>Initializes UniversityReporter.student</p>
     * @param student The student
     */
    public static void initializeStudent(Student student) {
        UniversityReporter.student = student;
    }

    /**
     * <p>Initializes UniversityReporter.course</p>
     * @param course The course
     */
    public static void initializeCourse(Course course) {
        UniversityReporter.course = course;
    }

    /**
     * <p>Checks if UniversityReporter.university is null</p>
     * @return boolean
     */
    private static boolean isUniversityNull() {
        return UniversityReporter.university == null;
    }

    /**
     * <p>Checks if UniversityReporter.student is null</p>
     * @return boolean
     */
    private static boolean isStudentNull() {
        return UniversityReporter.student == null;
    }

    /**
     * <p>Checks if UniversityReporter.course is null</p>
     * @return boolean
     */
    private static boolean isCourseNull() {
        return UniversityReporter.course == null;
    }

    /**
     * <p>Reports (prints) all courses within the University using the <code>report</code> method that was given by the interface <code>Reportable</code></p>
     */
    public static void reportCourses() {
        if (isUniversityNull()) {
            System.out.println("University is not initialized. Use UniversityReporter.InitializeUniversity(University university) to initialize it.");
            return;
        }

        System.out.println("Courses:");
        System.out.print("[");
        for (var course : university.getCourses()) {
            course.report();
            if (course != university.getCourses().get(university.getCourses().size() - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Reports (prints) all students who have the course</p>
     */
    public static void reportStudentsWithinTheCourse() {
        if (isUniversityNull()) {
            System.out.println("University is not initialized. Use UniversityReporter.InitializeUniversity(University university) to initialize it.");
            return;
        }

        if (isCourseNull()) {
            System.out.println("Course is not initialized. Use UniversityReporter.InitializeCourse(Course course) to initialize it.");
            return;
        }

        System.out.println("Students within the course:");
        System.out.println("[");
        for (var studentInTheCourse : course.getStudentsWithinTheCourse()) { 
            System.out.print("Id: " + studentInTheCourse.getId() + " Name: " + studentInTheCourse.getName() + ", ");
        }
        System.out.println("]");
        System.out.println("---------------------------------------------------");
    }

    /**
     * <p>Reports (prints) all courses of the student</p>
     */
    public static void reportCoursesOfTheStudent() {
        if (isUniversityNull()) {
            System.out.println("University is not initialized. Use UniversityReporter.InitializeUniversity(University university) to initialize it.");
            return;
        }

        if (isStudentNull()) {
            System.out.println("Student is not initialized. Use UniversityReporter.InitializeStudent(Student student) to initialize it.");
            return;
        }

        System.out.println("Courses of the student:");
        System.out.println("[");
        for (var courseOfTheStudent : student.getCourses()) {
            System.out.print("Code: " + courseOfTheStudent.getCode() + " Title: " + courseOfTheStudent.getTitle() + ", ");
        }
        System.out.println("]");
        System.out.println("---------------------------------------------------");
    }

    public static void generateReports() {
        if (isUniversityNull()) {
            System.out.println("University is not initialized. Use UniversityReporter.InitializeUniversity(University university) to initialize it.");
            return;
        }

        if (isCourseNull()) {
            System.out.println("Course is not initialized. Use UniversityReporter.InitializeCourse(Course course) to initialize it.");
            return;
        }

        if (isStudentNull()) {
            System.out.println("Student is not initialized. Use UniversityReporter.InitializeStudent(Student student) to initialize it.");
            return;
        }

        reportCourses();
        reportStudentsWithinTheCourse();
        reportCoursesOfTheStudent();
    }
}
