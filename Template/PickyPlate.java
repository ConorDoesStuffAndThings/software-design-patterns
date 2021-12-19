public class PickyPlate extends Plate{

    String[] meatOnPlate = {"Chicken"};
    String[] sidesOnPlate = {"Chips"};

    boolean vegWanted(){
        return false;
    }

    @Override
    void addMeat() {
        System.out.println("The meat on the plate is: ");

        for(String m: meatOnPlate){
            System.out.print(m + " \n");
        }
    }

    @Override
    void addVeg() {

    }

    @Override
    void addSide() {
        System.out.println("\nThe sides on the plate are: ");

        for(String s: sidesOnPlate){
            System.out.print(s + " \n");
        }
    }


}
