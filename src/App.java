import javax.swing.Popup;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        GenericStack<Person> kule = new GenericStack<>(5);

        GenericStack<DVD> dvdBox = new GenericStack<>(10);

        kule.push(new Person("Gökhan", 18));
        kule.push(new Person("MSP", 21));
        kule.push(new Person("MFG", 21));
        kule.push(new Person("Mustafa", 21));
        kule.push(new Person("MHK", 77));
        kule.push(new Person("Şevval", 21));
        kule.push(new Person("Bilge", 21));

        System.out.println(kule.display());
        System.out.println("-----------------POP 1--------------------");
        System.out.println(kule.pop());
        System.out.println(kule.getSize());
        System.out.println(kule.getElementCount());
        System.out.println("-----------------POP 2--------------------");
        System.out.println(kule.pop());
        System.out.println(kule.getSize());
        System.out.println(kule.getElementCount());
        System.out.println("-----------------POP 3--------------------");
        System.out.println(kule.pop());
        System.out.println(kule.getSize());
        System.out.println(kule.getElementCount());

        System.out.println("------------------DISPLAY ------------------");
        System.out.println(kule.display());

    }
} 