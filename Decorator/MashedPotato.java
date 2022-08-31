public class MashedPotato extends DinnerDecorator{

    private Plate plate;

    MashedPotato(Plate plate){

    }

    public MashedPotato() {
    }

    public String getDescription() {
        return plate.getDescription() + ", Mashed Potatoes";
    }

    @Override
    public double price() {
        return plate.price() + 4;
    }
}
