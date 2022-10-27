public abstract class AFuelCar extends ACar {

    int kmPrLitre = 0;

    public AFuelCar(String registrationnumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationnumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int kmPrLitre(){
        return 0;
    }

}
