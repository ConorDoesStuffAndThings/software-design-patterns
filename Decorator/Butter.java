public class Butter extends MashDecorator{

    private MashedPotato mash;

    Butter(MashedPotato mash){
        this.mash = mash;
    }

    public String getDescription(){
        return mash.getDescription() + ", Butter";
    }

    @Override
    public double price(){
        return mash.price() + 0.5;
    }
}
