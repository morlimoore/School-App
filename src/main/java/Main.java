public class Main {
//    static Principal principal;

    public static void main(String[] args) {

        /** Create the School with a name */
        School school = new School("UHS");

        /** Create the Principal */
        Principal principal = new Principal("Mr. Okon");

        /** Add courses to be offered by the school */
        school.getCourses().addCourse("FEG404");
        school.getCourses().addCourse("ECE333");
        school.getCourses().addCourse("FEG401");
        school.getCourses().addCourse("ECE317");
        school.getCourses().addCourse("EEE202");
        school.getCourses().addCourse("ECE103");
        school.getCourses().printCourses();


        /** Create Teachers */
        Teacher teacher1 = new Teacher("stf01", "Habeeb", "ECE341");
        Teacher teacher2 = new Teacher("stf02", "Lekan", "MEC303");
        Teacher teacher3 = new Teacher("stf03", "Okeke", "ECE121");

        /** The principal should employ teachers to the school */
        principal.admit(teacher1);
        principal.admit(teacher2);
        principal.admit(teacher3);

        /** List all the teachers employed in the school */
        school.printTeachers();

        /** Create applicants applying to the school */
        Applicant applicant1 = new Applicant("app01", "JohnPaul", "ECE103", 20);
        Applicant applicant2 = new Applicant("app02", "Ugo", "EEE202", 15);
        Applicant applicant3 = new Applicant("app03", "Chinyere", "ECE318", 19);
        Applicant applicant4 = new Applicant("app04","Wisdom", "ECE333", 17);
        Applicant applicant5 = new Applicant("app05","Iniobong", "FEG401", 20);
        Applicant applicant6 = new Applicant("app06","Abasifreke", "ECE333", 21);
        Applicant applicant7 = new Applicant("app07","Bassey", "FEG401", 22);

        /** The assesses the applicants and reveals their admission status */
        principal.admit(applicant1);
        principal.admit(applicant4);
        principal.admit(applicant5);
        principal.admit(applicant6);
        principal.admit(applicant7);


        /** List out all the students currently in the school */
        school.printStudents();


        /** Try to admit an already admitted student */
        principal.admit(applicant1);


        /** Principal rejects an applicant based off age */
        principal.admit(applicant2);


        /** Principal rejects an applicant based off course of choice */
        principal.admit(applicant3);


        /** Principal expels a student */
        principal.expel("app01");

        /** List all the students currently in the school */
        school.printStudents();


        /** List out all the courses offered in the school */
        school.getCourses().printCourses();


        /** Principal expels a non-existent student */
        principal.expel("app01");
    }
}
