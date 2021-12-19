public class RoastPotato extends DinnerDecorator{

    private Plate plate;

    RoastPotato(Plate plate){
        this.plate = plate;
    }

    public String getDescription() {
        return plate.getDescription() + ", Roast Potato";
    }

    @Override
    public double price() {
        return plate.price() + 2.5;
    }
}
