public class Main {
    public static void main(String[] arg){
        DriverPetrov driverPetrov = new DriverPetrov("Петров Иван Иванович", "B");
        System.out.println(driverPetrov.toString());
        driverPetrov.startMoving();
        driverPetrov.stop();
        driverPetrov.refuelTheCar();

        System.out.println();

        DriverIvanov driverIvanov = new DriverIvanov("Иванов Иван Иванович", "C");
        System.out.println(driverIvanov.toString());
        driverIvanov.startMoving();
        driverIvanov.stop();
        driverIvanov.refuelTheCar();

        System.out.println();

        DriverOgnev driverOgnev = new DriverOgnev("Огнев Иван Иванович", "C");
        System.out.println(driverOgnev.toString());
        driverOgnev.startMoving();
        driverOgnev.stop();
        driverOgnev.refuelTheCar();


    }
}
