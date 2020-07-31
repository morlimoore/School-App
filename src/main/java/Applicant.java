public class Applicant extends Scholar {
    private int age;

    /**
     * This creates the Applicant object which goes on to
     * be assessed by the principal, whether eligible for admission,
     * or not.
     * @param id
     * @param name
     * @param course
     * @param age
     */
    public Applicant(String id, String name, String course, int age) {
        super(id, name, course);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
