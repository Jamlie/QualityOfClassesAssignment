package jam.com;

/**
 * <h1>UniversityReporter</h1>
 * <p>A UniversityReporter is used to generate reports off a given university via initializeUniversity</p>
 */
public class UniversityReporter {
    private UniversityReporter() {}

    private static University university;

    /**
     * <p>Initializes UniversityReporter.university</p>
     * @param university The university
     */
    public static void initializeUniversity(University university) {
        UniversityReporter.university = university;
    }

    /**
     * <p>Checks if UniversityReporter.university is null</p>
     * @return boolean
     */
    private static boolean isUniversityNull() {
        return UniversityReporter.university == null;
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

        System.out.println("Students within the course:");
        for (Course course : UniversityReporter.university.getCourses()) {
            System.out.println(course.getTitle() + ": " + course.getStudentsWithinTheCourse());
        }
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

        System.out.println("Courses of the student:");
        for (Student student : UniversityReporter.university.getStudents()) {
            System.out.println(student.getName() + ": " + student.getCourses());
        }
        System.out.println("---------------------------------------------------");
    }

    public static void generateReports() {
        if (isUniversityNull()) {
            System.out.println("University is not initialized. Use UniversityReporter.InitializeUniversity(University university) to initialize it.");
            return;
        }

        reportCourses();
        reportStudentsWithinTheCourse();
        reportCoursesOfTheStudent();
    }
}
