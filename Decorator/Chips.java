public class Chips extends DinnerDecorator{

    private Plate plate;

    Chips(Plate plate){
        this.plate = plate;
    }

    public String getDescription() {
        return plate.getDescription() + ", Chips";
    }

    @Override
    public double price() {
        return plate.price() + 3.5;
    }
}
