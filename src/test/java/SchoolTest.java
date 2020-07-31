import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    /**
     * The test cases for the addStudent, removeStudent and addTeacher methods, had
     * already been captured in the PrincipalTest class file.
     */

    @Test
    @DisplayName("If Student is enrolled in School")
    void ifStudentExists() {
        School school = new School("UHS");
        school.getCourses().addCourse("CSC201");
        Student student = new Student("std01", "John Nwaefi", "CSC201");
        school.addStudent(student);
        assertTrue(school.getStudents().containsKey(student.getId()));
    }
}