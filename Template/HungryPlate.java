public class HungryPlate extends Plate{

    String[] meatOnPlate = {"Beef", "Chicken", "Turkey"};
    String[] vegOnPlate = {"Carrots", "Broccoli", "Parsnips"};
    String[] sidesOnPlate = {"Mash", "Chips"};

    @Override
    void addMeat() {
        System.out.println("\nThe meat on the plate is: \n");

        for(String m: meatOnPlate){
            System.out.print(m + " \n");
        }
    }

    @Override
    void addVeg() {
        System.out.println("\nThe veg on the plate is: ");

        for(String v: vegOnPlate){
            System.out.print(v + " \n");
        }
    }

    @Override
    void addSide() {
        System.out.println("\nThe sides on the plate are: ");

        for(String s: sidesOnPlate){
            System.out.print(s + " ");
        }
    }

    @Override
    public double price() {
        return 0;
    }
}
