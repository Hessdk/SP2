public abstract class ACar implements ICar {
    String registrationnumber = "";
     String make = "";

     String model = "";
     int numberOfDoors = 0;

    public ACar (String registrationnumber, String make, String model, int numberOfDoors){
    this.registrationnumber = registrationnumber;
    this.make = make;
    this.model = model;
    this.numberOfDoors = numberOfDoors;
    }
    public String getRegistrationNumber(){
        return registrationnumber;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "ACar{" +
                "registrationnumber='" + registrationnumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
