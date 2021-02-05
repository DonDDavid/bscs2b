package Abstract;

public class Anna extends ExtendingStudentRecord{

    @Override
    public void Email() {
        System.out.println("Email Address: " + "anna@wvsu.edu.ph");

    }

    @Override
    public void OopGrades() {
        System.out.println("OOP Grades: " + "95");

    }
}
