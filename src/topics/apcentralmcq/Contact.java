package topics.apcentralmcq;

public class Contact {
    private final String contactName;

    private final String contactNumber;

    public Contact(String name, String number) {
        contactName = name;
        contactNumber = number;
    }

    public void doSomething() {
        System.out.println(this);
    }

    public String toString() {
        return contactName + " " + contactNumber;
    }
}