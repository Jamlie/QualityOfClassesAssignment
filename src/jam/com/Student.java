package jam.com;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String email;
    private ArrayList<Course> courses;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        courses = new ArrayList<Course>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already exists.");
            return;
        }

        courses.add(course);
    }

    public void removeCourse(Course course) {
        if (!courses.contains(course)) {
            System.out.println("Course does not exist.");
            return;
        }

        courses.remove(course);
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
