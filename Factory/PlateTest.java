import javax.swing.*;

public class PlateTest {
    public static void main(String[] args) {

        PlateFactory plateFactory = new PlateFactory();

        DefaultPlate plate = null;

        String userDecision = JOptionPane.showInputDialog("Which plate would you like? (1 / 2)");

        if(userDecision!= null){
            plate = plateFactory.makePlate(userDecision);
        }


        else
            JOptionPane.showInputDialog("Please enter either 1 or 2");

        servePlate(plate);
    }

    public static void servePlate(DefaultPlate plate){

        plate.displayDish();

    }

}
