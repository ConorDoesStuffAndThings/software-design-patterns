public class Pepper extends MashDecorator{

    private MashedPotato mash;

    Pepper(MashedPotato mash){
        this.mash = mash;
    }

    public String getDescription(){
        return mash.getDescription() + ", Pepper";
    }

    @Override
    public double price(){
        return mash.price() + 0.1;
    }
}
