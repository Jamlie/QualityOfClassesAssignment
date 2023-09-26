# Student
## Properties
* `id` - `int` - id of the student
* `name` - `String` - name of the student
* `email` - `String` - email of the student
* `courses` - `ArrayList<Course>` - courses of the student

## Methods
* `getId` - gets the id of the student
* `getName` - gets the name of the student
* `getEmail` - gets the email of the student
* `getCourses` - gets the courses of the student
* `addCourse` - adds a course to the student
* `removeCourse` - removes a course from the student
* `toString` - returns a string representation of the student
* `equals` - checks if two students are equal

# Course
## Properties
* `code` - `String` - code of the course
* `title` - `String` - title of the course
* `instructor` - `String` - instructor of the course
* `maxStudents` - `int` - maximum number of students in the course
* `studentsWithinTheCourse` - `ArrayList<Student>` - students within the course

## Methods
* `getCode` - gets the code of the course
* `getTitle` - gets the title of the course
* `getInstructor` - gets the instructor of the course
* `getMaxStudents` - gets the maximum number of students in the course
* `getStudentsWithinTheCourse` - gets the students within the course
* `isFull` - checks if the course is full
* `isAvailable` - checks if the course is available
* `addStudent` - adds a student to the course
* `removeStudent` - removes a student from the course
* `toString` - returns a string representation of the course
* `equals` - checks if two courses are equal

# University
## Properties
* `students` - `ArrayList<Student>` - students of the university
* `courses` - `ArrayList<Course>` - courses of the university

## Methods
* `addStudent` - adds a student to the university
* `addStudents` - adds students to the university
* `removeStudent` - removes a student from the university
* `removeStudents` - removes students from the university
* `addCourse` - adds a course to the university
* `addCourses` - adds courses to the university
* `removeCourse` - removes a course from the university
* `removeCourses` - removes courses from the university
* `registerStudentToCourse` - registers a student to a course
* `unregisterStudentFromCourse` - unregisters a student from a course
* `getCourses` - gets the courses of the university
* `getStudents` - gets the students of the university
* `reportStudents` - reports the students of the university
* `reportCourses` - reports the courses of the university
* `reportStudentsWithinTheCourse` - reports the students within a course
* `reportCoursesOfTheStudent` - reports the courses of a student
* `generateReports` - generates reports of the university, such as students, courses, students within a course, and courses of a student