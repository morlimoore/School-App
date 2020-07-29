public class Main {
    static Principal principal;

    public static void seekAdmission(Applicant applicant) {
        try {
            principal.admit(applicant);
        } catch(Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {

        School school = new School("UHS");

        school.getCourses().addCourse("FEG404");
        school.getCourses().addCourse("ECE333");
        school.getCourses().addCourse("FEG401");
        school.getCourses().addCourse("ECE317");
        school.getCourses().addCourse("EEE202");
        school.getCourses().addCourse("ECE103");
        school.getCourses().printCourses();

        principal = new Principal("Mr. Okon");

        Teacher teacher1 = new Teacher("stf01", "Habeeb", "ECE341");
        Teacher teacher2 = new Teacher("stf02", "Lekan", "MEC303");
        Teacher teacher3 = new Teacher("stf03", "Okeke", "ECE121");

        Applicant applicant1 = new Applicant("app01", "JohnPaul", "ECE103", 20);
        Applicant applicant2 = new Applicant("app02", "Ugo", "EEE202", 15);
        Applicant applicant3 = new Applicant("app03", "Chinyere", "ECE318", 19);
        Applicant applicant4 = new Applicant("app04","Wisdom", "ECE333", 17);
        Applicant applicant5 = new Applicant("app05","Iniobong", "FEG401", 20);
        Applicant applicant6 = new Applicant("app06","Abasifreke", "ECE333", 21);
        Applicant applicant7 = new Applicant("app07","Bassey", "FEG401", 22);

        seekAdmission(applicant1);
        seekAdmission(applicant2);
        seekAdmission(applicant1);
        seekAdmission(applicant3);
        seekAdmission(applicant4);
        seekAdmission(applicant5);
        seekAdmission(applicant6);
        seekAdmission(applicant7);

        school.printStudents();

        principal.expel("app01");

        school.printStudents();

        principal.admit(teacher1);
        principal.admit(teacher2);
        principal.admit(teacher3);

        school.printTeachers();
        school.getCourses().printCourses();
        principal.expel("app01");


    }
}
