public interface AdminActions {
    /**
     * Interface which the Principal implements
     * @param applicant, applicant, id
     */
    void admit(Applicant applicant);

    void admit(Teacher teacher);

    void expel(String id);
}
