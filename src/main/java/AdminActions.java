public interface AdminActions {
    void admit(Applicant applicant) throws InvalidAgeException;

    void admit(Teacher teacher);

    void expel(String id);
}
