public class DieselCar extends AFuelCar {

    Boolean particleFilter;
    public DieselCar(String registrationnumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationnumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    public int getRegistrationFee() {
         int gasolinePrice = 0;
         int widthdrawalTax = 0;

           if (kmPrLitre >= 20 && kmPrLitre < 50) {
               gasolinePrice = 330;
               widthdrawalTax = 130;
           } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
               gasolinePrice = 1050;
               widthdrawalTax = 1390;
           } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
               gasolinePrice = 2340;
               widthdrawalTax = 1850;
           }
              else if (kmPrLitre >= 5 && kmPrLitre < 10){
                  gasolinePrice =5500;
                  widthdrawalTax =2770;
               }
            else {
               gasolinePrice = 10470;
               widthdrawalTax = 15260;
           }
           int registrationFee = gasolinePrice + widthdrawalTax;

           if (!hasParticleFilter()) {
               return registrationFee + 1000;
           }
           else return registrationFee;

        }
    public boolean hasParticleFilter(){
return true;
    }

    @Override
    public String toString() {
        return "DieselCar{ \n" +
                "particleFilter=" + particleFilter +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationnumber='" + registrationnumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
