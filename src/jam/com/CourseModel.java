package jam.com;

/**
 * <h1>CourseModel</h1>
 * <p>It is a model of the Course class</p>
 */
public class CourseModel {
    private final String code;
    private String title;
    private String instructor;
    private int maxCapacity;

    public CourseModel(String code, String title, String instructor, int maxCapacity) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>Gets the course's code</p>
     * @return the course's code
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>Gets the course's title</p>
     * @return the course's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>Gets the course's instructor</p>
     * @return the course's instructor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * <p>Gets the course's max capacity</p>
     * @return the course's max capacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }
}
