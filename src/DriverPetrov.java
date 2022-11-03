public class DriverPetrov extends Driver {

    public DriverPetrov(String fio, String driverLicense) {
        super(fio, driverLicense);
        if(driverLicense == null || driverLicense.isEmpty() || driverLicense == "D" || driverLicense == "С"){
            this.setDriverLicense("default");
        }else {
            this.setDriverLicense("легковым автомобилем");
        }

    }
    @Override
    public void startMoving() {
        System.out.println("Водитель " + getFio() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getFio() + " заправляет авто");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель " + getFio() + " останавливается");
    }
    public String toString() {
        return "Водитель " + getFio() + " управляет " + getDriverLicense() + " и будет участвовать в заезде";
    }
}
