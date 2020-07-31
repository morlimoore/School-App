public class Scholar {

    /**
     * Create Scholar object
     */
    private String id;
    private String name;
    private String course;

    public Scholar(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return name + " with Id: " + id + ", studying " + course;
    }
}
