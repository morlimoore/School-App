public class Applicant extends Scholar {
    private int age;

    public Applicant(String id, String name, String course, int age) {
        super(id, name, course);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
