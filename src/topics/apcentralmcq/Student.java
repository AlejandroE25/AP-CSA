package topics.apcentralmcq;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    public Student(String firstName, String lastName, int age) {
        firstName = firstName;

        lastName = lastName;

        age = age;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}