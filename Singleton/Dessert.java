import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Dessert {

    private static Dessert firstInstance = null;

    //Dessert options in an array

    String[] dessertOptions = {"Chocolate Cake", "Cheese Cake", "Apple Pie"};

    private LinkedList<String> dessertList = new LinkedList<String>(Arrays.asList(dessertOptions));

    static boolean firstThread = true;

    private Dessert(){

    }

    public static Dessert getInstance(){

        if(firstInstance == null){

            if(firstThread){

                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            firstInstance = new Dessert();
        }

        return firstInstance;

    }

    public Constable getDessert(){
        int len = dessertOptions.length;
        Random generator = new Random();
        int randomInt = generator.nextInt(len);

        return dessertList.get(randomInt);
    }



}
