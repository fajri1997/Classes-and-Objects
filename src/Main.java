//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Course newCourse = new Course  ("JAVA 101", "FAJRI ALHUSAINI",158);


        System.out.println(newCourse);



        newCourse.setCourseName("JAVA 102");
        newCourse.setInstructor("Ali Taqi");
        newCourse.setNumberOfStudentsEnrolled(203);

        System.out.println(newCourse);

    }
}