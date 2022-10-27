public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationnumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationnumber, make, model, numberOfDoors, kmPrLitre);
    }

   public String getFuelType() {
        return "gasoline";
    }
    public int getRegistrationFee(){
        if (kmPrLitre >= 20 && kmPrLitre < 50) {
            return 330;
        }
        else if (kmPrLitre >= 15 && kmPrLitre < 20){
            return 1050;
        }
        else if (kmPrLitre >= 10 && kmPrLitre <15){
            return 2340;
        }
        else if (kmPrLitre >=5 && kmPrLitre < 10){
            return 5500;
        }
        else {
            return 15260;
        }
    }

    @Override
    public String toString() {
        return "GasolineCar: \n" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationnumber='" + registrationnumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
