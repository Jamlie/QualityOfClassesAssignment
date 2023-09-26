package jam.com;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String code;
    private String title;
    private String instructor;
    private int maxCapacity;
    private ArrayList<Student> studentsWithinTheCourse;

    public Course(String code, String title, String instructor, int maxCapacity) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        studentsWithinTheCourse = new ArrayList<Student>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public ArrayList<Student> getStudentsWithinTheCourse() {
        return studentsWithinTheCourse;
    }

    public boolean isFull() {
        return studentsWithinTheCourse.size() == maxCapacity;
    }

    public boolean isAvailable() {
        return studentsWithinTheCourse.size() < maxCapacity;
    }

    public void addStudent(Student student) {
        if (isAvailable()) {
            studentsWithinTheCourse.add(student);
            return;
        }

        System.out.println("Course is full.");
    }

    public void removeStudent(Student student) {
        if (studentsWithinTheCourse.contains(student)) {
            studentsWithinTheCourse.remove(student);
            return;
        }

        System.out.println("Student is not in the course.");
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
