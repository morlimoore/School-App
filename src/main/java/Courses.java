import java.util.ArrayList;
import java.util.List;

public class Courses {

    /**
     * Courses class
     */
    private static List<String> courses;

    public Courses() {
        courses  = new ArrayList<String>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public boolean isCourseAvailable(String course) {
        return courses.indexOf(course) > -1;
    }

    public int getSize() {
        return courses.size();
    }

    public void printCourses() {
        courses.forEach(course -> System.out.println(course));
        System.out.println();
    }
}