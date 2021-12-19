import java.util.Arrays;

public abstract  class DefaultPlate {

    private String[] meat;
    private String[] veg;
    private String[] side;

    public String[] getMeat(){
        return meat;
    }

    public void setMeat(String[] newMeat){
        meat = newMeat;
    }

    public String[] getVeg() {
        return veg;
    }

    public void setVeg(String[] newVeg){
        veg = newVeg;
    }

    public String[] getSide() {
        return side;
    }

    public void setSide(String[] newSide){
        side = newSide;
    }

    public void displayDish(){
        System.out.println("The dish is " + Arrays.toString(getMeat()) + " ," + Arrays.toString(getSide()) + ", " + Arrays.toString(getVeg()));
    }
}
