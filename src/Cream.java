public class Cream extends MashDecorator{

    private MashedPotato mash;

    Cream(MashedPotato mash){
        this.mash = mash;
    }

    public String getDescription(){
        return mash.getDescription() + ", Cream";
    }

    @Override
    public double price(){
        return mash.price() + 0.15;
    }
}
