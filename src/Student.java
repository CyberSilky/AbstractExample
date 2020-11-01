public class Student implements IPerson {

    private String firstName;
    private String lastName;

    @Override
    public void DisplayInfo()
    {
        System.out.println("Your student name is: " + firstName + " " + lastName);
    }
}
