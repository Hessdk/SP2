public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;
    String make;
    String model;


    public ElectricCar(String registrationnumber, String make, String model, int numberOfDoors,  int batteryCapacity, int maxRange){
        super(registrationnumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.make = make;
        this.model = model;
    }



    String getFuelType() {
        return "Electric";
    }


    public int getRegistrationFee() {
        if (getWhPrKm() >= 20) {
            return 330;
        }
        else if (getWhPrKm() >= 15 && getWhPrKm() < 20){
            return 1050;
        }
        else if (getWhPrKm() >= 10 && getWhPrKm() <15){
            return 2340;
        }
        else if (getWhPrKm() >=5 && getWhPrKm() < 10){
            return 5500;
        }
        else {
            return 15260;
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public double getWhPrKm(){
        double capacityWh = batteryCapacity*1000;
        return 100 / ((capacityWh/maxRange)/91.25);
    }



    @Override
    public String toString() {
        return "Electric Car: \n" +
                "Make: " + make +
                ", Model: " + model +
                ", Battery capacity =" + getBatteryCapacity() +
                ", Max range =" + getMaxRange() +
                ", Km/l =" + getWhPrKm() + "\n";
                    }
}
