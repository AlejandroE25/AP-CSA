package topics.apcentralmcq;

import static topics.apcentralmcq.HelperFunctions.print;

public class Other {
//    public static void main(String[] args) {
//        Person andy = new Person("Andy", 5, 6);
//        Person ben = new Person("Ben", 6, 5);
//        print(andy.compareHeights(ben));
//    }

//    public static void main(String[] args) {
//        Contact c = new Contact("Alice", "555-1234");
//        c.doSomething();
//        c = new Contact("Daryl", "");
//        c.doSomething();
//    }

//    public static void main(String[] args) {
//        UnitsHandler large = new UnitsHandler(100);
//        UnitsHandler.update(8);
//    }

    public static void main(String[] args) {
        Gadget a = new Gadget();
        int status = a.status;
        Gadget.setStatus(3);
        status = a.status;
        Gadget b = new Gadget();
        status = b.status;
    }
}
