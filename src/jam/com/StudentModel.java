package jam.com;

/**
 * <h1>StudentModel</h1>
 * <p>It is a model of the Student class</p>
 */
public class StudentModel {
    private final int id;
    private String name;
    private String email;

    public StudentModel(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * <p>Gets the student's ID</p>
     * @return the student's ID
     */
    public int getId() {
        return id;
    }

    /**
     * <p>Gets the student's name</p>
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Gets the student's email</p>
     * @return the student's email
     */
    public String getEmail() {
        return email;
    }
}
