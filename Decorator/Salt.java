public class Salt extends MashDecorator{
    private MashedPotato mash;

    Salt(MashedPotato mash){
        this.mash = mash;
    }

    public String getDescription(){
        return mash.getDescription() + ", Salt";
    }

    @Override
    public double price(){
        return mash.price() + 0.1;
    }
}
