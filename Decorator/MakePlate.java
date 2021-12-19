public class MakePlate {
    public static void main(String[] args) {

        Plate plate = (new Salmon());
        plate = new Chips (plate);

        System.out.println("Items on plate: " + plate.getDescription() + ", Total: " + plate.price());
    }
}
