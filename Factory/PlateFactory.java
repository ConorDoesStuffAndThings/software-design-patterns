public class PlateFactory {

    public DefaultPlate makePlate(String newPlateType){

        DefaultPlate newPlate = null;

        if(newPlateType.equals("1")){
            return  new FirstPlate();
        }

        else if(newPlateType.equals("2")){
            return  new SecondPlate();
        }

        else
            return null;
    }
}
