public class Course {

    private String courseName;
    private String instructor;
    private int numberOfStudentsEnrolled;

    public Course(String courseName, String instructor, int numberOfStudentsEnrolled) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    //GETTER
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }


    //setters
    public void setCourseName(String newNourseName) {
        this.courseName = newNourseName;
    }
    public void setInstructor(String newInstructor) {
        this.instructor = newInstructor;
    }

    public void setNumberOfStudentsEnrolled(int newNumberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = newNumberOfStudentsEnrolled;
    }

    @Override
    public String toString() {
        return "Course {" +
                "course name: '" + courseName + '\'' +
                ", instructor: '" + instructor + '\'' +
                ", number Of Students Enrolled: '" + numberOfStudentsEnrolled + '\'' +
                '}';
    }
}
