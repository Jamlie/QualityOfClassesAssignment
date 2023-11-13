package jam.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <h1>Course</h1>
 * <p>It implements the <code>Reportable</code> interface, thus; should be reported in the University</p>
 */
public class Course implements Reportable {
    private final String code;
    private String title;
    private String instructor;
    private int maxCapacity;
    private List<Student> studentsWithinTheCourse;

    public Course(CourseModel courseModel) {
        this.code = courseModel.getCode();
        this.title = courseModel.getTitle();
        this.instructor = courseModel.getInstructor();
        this.maxCapacity = courseModel.getMaxCapacity();
        studentsWithinTheCourse = new ArrayList<>();
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

    /**
     * <p>Gets the students who are within the course</p>
     * @return the students within the course
     */
    public List<Student> getStudentsWithinTheCourse() {
        return studentsWithinTheCourse;
    }

    /**
     * <p>Checks if the course is full</p>
     * @return true if the course is full, false otherwise
     */
    public boolean isFull() {
        return studentsWithinTheCourse.size() == maxCapacity;
    }

    /**
     * <p>Checks if the course is available</p>
     * @return true if the course is available, false otherwise
     */
    public boolean isAvailable() {
        return studentsWithinTheCourse.size() < maxCapacity;
    }

    /**
     * <p>Prints out the current object</p>
     */
    @Override
    public void report() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", title=" + title +
                ", instructor=" + instructor +
                ", maxCapacity=" + maxCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return maxCapacity == course.maxCapacity && Objects.equals(code, course.code) && Objects.equals(title, course.title) && Objects.equals(instructor, course.instructor) && Objects.equals(studentsWithinTheCourse, course.studentsWithinTheCourse);
    }
}
