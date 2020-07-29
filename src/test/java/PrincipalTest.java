import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrincipalTest {
    Principal principal;
    Applicant applicant1;
    Student student;

    @BeforeEach
    void setup() {
        principal = new Principal("Okon");
        applicant1 = new Applicant("app01", "JohnPaul", "ECE103", 20);
        student = new Student(applicant1);
    }


    @Test
    @DisplayName("When age is valid")
    void admitTest() {
        principal.admit(applicant1);
        assertIterableEquals(courses, applicant1);
    }
}
