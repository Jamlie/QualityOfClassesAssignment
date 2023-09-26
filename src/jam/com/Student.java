package jam.com;

import java.util.ArrayList;
import java.util.Objects;

/**
 * <h1>Student</h1>
 * <p>It implements the <code>Reportable</code> interface, thus; should be reported in the University</p>
 */
public class Student implements Reportable {
    private final int id;
    private String name;
    private String email;
    private ArrayList<Course> courses;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        courses = new ArrayList<Course>();
    }

    /**
     * <p>Gets the student's ID</p>
     * @return The student's ID
     */
    public int getId() {
        return id;
    }

    /**
     * <p>Gets the student's name</p>
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Gets the student's email</p>
     * @return The student's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>Gets the student's courses</p>
     * @return The student's courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * <p>Adds a course to the student's courses</p>
     */
    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already exists.");
            return;
        }

        courses.add(course);
    }

    /**
     * <p>Removes a course from the student's courses</p>
     */
    public void removeCourse(Course course) {
        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        courses.remove(course);
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
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (getClass() != o.getClass())) return false;

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(courses, student.courses);
    }
}
