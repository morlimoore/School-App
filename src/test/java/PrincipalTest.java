import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class PrincipalTest {
    Principal principal;
    Applicant applicant;
    School school;
    int length;

    @BeforeEach
    void setup() {
        principal = new Principal("Okon");
        school = new School("UHS");
        school.getCourses().addCourse("ECE103");
        length = school.noOfStudents();
        applicant = new Applicant("app01", "JohnPaul", "ECE103", 20);
    }

    @Test
    @DisplayName("When Applicant age is valid")
    void admitStudentTest() {

        principal.admit(applicant);
        assertEquals(school.noOfStudents(), length + 1, "The  method should add a student");
    }

    @Test
    @DisplayName("When Applicant age is invalid")
    void admitStudentTest2() {
        applicant = new Applicant("app01", "JohnPaul", "ECE103", 15);
        principal.admit(applicant);
        assertEquals(school.noOfStudents(), length, "The method should not add a student");
    }

    @Test
    @DisplayName("Expel a Student")
    void expelStudentTest() {
        principal.admit(applicant);
        principal.expel(applicant.getId());
        assertEquals(school.noOfStudents(), length, "The method should expel a student");
    }

    @Test
    @DisplayName("Expel a Student that does not exist")
    void expelStudentTest2() {
        principal.expel(applicant.getId());
        assertEquals(school.noOfStudents(), length, "The method should not find the student");
    }

    @Test
    @DisplayName("Admit a teacher")
    void admitTeacherTest() {
        Teacher teacher = new Teacher("stf01", "Habeeb", "ECE341");
        principal.admit(teacher);
        HashMap<String, Teacher> test = new HashMap<String, Teacher>();
        test.put(teacher.getId(), teacher);
        assertIterableEquals(school.getTeachers().values(), test.values());
    }
}
