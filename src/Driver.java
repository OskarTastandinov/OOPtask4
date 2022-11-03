public abstract class Driver {

    private String fio; // фио
    private String experience; // стаж
    private String driverLicense; // наличие прав

    public Driver(String fio, String driverLicense) {
        if(fio == null || fio.isEmpty()){
            this.fio = "default";
        }else {
            this.fio = fio;
        }
        this.driverLicense=driverLicense;
    }
    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuelTheCar();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}

