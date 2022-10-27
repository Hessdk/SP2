import java.util.ArrayList;

public class FleetOfCars {
    public ArrayList<ICar> inventory = new ArrayList<>();


public FleetOfCars (){

}
public void addCar (ICar car){
    inventory.add(car);
}
int getTotalRegistrationFee(){
    int total=0;
    for (ICar iCar : inventory){
        total += iCar.getRegistrationFee();

    }
    return total;
}

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "inventory=" + inventory +
                '}';
    }

    public ArrayList<ICar> getInventory() {
        return inventory;
    }
}
