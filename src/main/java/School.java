import java.util.*;

public class School {
    private static String name;
    private static HashMap<String, Student> students;
    private static HashMap<String, Teacher> teachers;
    private static Courses courses = new Courses();
    private static final int MINIMUM_AGE = 16;

    /**
     * Supply school name
     * @param name
     */
    public School(String name) {
        this.name = name;
        students = new HashMap<String, Student>();
        teachers = new HashMap<String, Teacher>();
    }

    public static String getName() {
        return name;
    }

    public static int getMINIMUM_AGE() {
        return MINIMUM_AGE;
    }

    public static void addStudent(Student student) {
        if(ifStudentExists(student.getId())) {
            System.err.println(student.getName() + " is already a student of " + name + ".\n");
        } else {
            if (courses.isCourseAvailable(student.getCourse())) {
                students.put(student.getId(), student);
                System.out.println(student.getName() + " was admitted successfully.");
                System.out.println("Class size is now " + students.size() + "\n");
            } else {
                System.err.println("Sorry, admission denied:\n" + student.getCourse() +
                        " is not offered in " + name + ".\n");
            }

        }
    }

    public static void removeStudent(String studentId) {
        students.remove(studentId);
    }

    public void printStudents() {
        horizontalLine();
        System.out.println("Students list:\n");
        for (Map.Entry m : students.entrySet()) {
            System.out.println(m.getValue());
        }
        System.out.println("\nClass total: " + students.size());
        horizontalLine();
    }

    public int noOfStudents() {
        return students.size();
    }

    public static void addTeacher(Teacher teacher) {
        teachers.put(teacher.getId(), teacher);
        courses.addCourse(teacher.getCourse());
    }

    public void printTeachers() {
        horizontalLine();
        System.out.println("Teachers:\n");
        for (Map.Entry m : teachers.entrySet()) {
            System.out.println(m.getValue());
        }
        System.out.println();
        horizontalLine();
    }

    public int noOfTeachers() {
        return teachers.size();
    }

    public void horizontalLine() {
        String hr = "-";
        int i = 50;
        while(i > 0) {
            hr += "-";
            i--;
        }
        System.out.println(hr);
    }

    public Courses getCourses() {
        return courses;
    }

    public static boolean ifStudentExists(String id) {
        return students.containsKey(id);
    }
}