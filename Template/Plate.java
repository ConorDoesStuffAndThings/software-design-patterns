abstract class Plate {

    final void makePlate(){

        if(meatWanted()){
            addMeat();
        }

        if(vegWanted()){
            addVeg();
        }

        if(sideWanted()){
            addSide();
        }

        servePlate();
    }

    abstract void addMeat();
    abstract void addVeg();
    abstract void addSide();

    boolean meatWanted(){
        return true;
    }

    boolean vegWanted(){
        return true;
    }

    boolean sideWanted(){
        return true;
    }

    String description = "Plate";

    String getDescription(){
        return description;
    }

    public void servePlate(){
        System.out.print("\nThe plate is served!\n\n");
    }

    public abstract double price();
}
