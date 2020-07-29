public class Teacher extends Staff {
    private String id;
    private String course;

    public Teacher(String id, String name, String course) {
        super(name);
        this.id = id;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String toString() {
        return this.getName() + " with Staff Id: " + id + ", teaches " + course;
    }
}
