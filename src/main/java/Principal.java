public class Principal extends Staff implements AdminActions{

    /**
     * Supply principal name
     * @param name
     */
    public Principal(String name) {
        super(name);
    }

    @Override
    public void admit(Applicant applicant) {
        if (applicant.getAge() < School.getMINIMUM_AGE()) {
            System.err.println("Sorry " + applicant.getName() +
                    ", you have not been admitted to study " + applicant.getCourse() +
                    " at " + School.getName() + ". Try again when you are " + School.getMINIMUM_AGE() +
                    " years old.\n");
        } else {
            Student student = new Student(applicant.getId(), applicant.getName(), applicant.getCourse());
            School.addStudent(student);
        }
    }

    @Override
    public void expel(String id) {
        if(School.ifStudentExists(id)) {
            School.removeStudent(id);
            System.out.println("Student with id: " + id + ", has been expelled from " + School.getName() + "\n");
        } else {
            System.out.println("Student with id: " + id + ", was never a student of " + School.getName() + "\n");
        }
    }

    @Override
    public void admit(Teacher teacher) {
        School.addTeacher(teacher);
    }
}
