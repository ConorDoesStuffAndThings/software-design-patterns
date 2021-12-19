import java.util.LinkedList;

public class DessertTest {

    public static void main(String[] args) {
        Dessert newInstance = Dessert.getInstance();

        System.out.println("Dessert: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getDessert());

        LinkedList<String> oneDessert = (LinkedList<String>) newInstance.getDessert();

        System.out.println("Dessert of the day is: " + oneDessert);

        System.out.println(newInstance.getDessert());

        Dessert instanceTwo = Dessert.getInstance();

        System.out.println("Second Dessert of the day is: " + instanceTwo);

        System.out.println(newInstance.getDessert());
    }
}
