public class Main {
    public static void main(String[] args) {
       FleetOfCars garage = new FleetOfCars();

        garage.addCar(new ElectricCar("AA 10 101", "Tesla", "Y", 5, 82, 604));
        garage.addCar(new ElectricCar("AA 20 201", "Volvo", "XC40", 5, 75, 418));
        garage.addCar(new ElectricCar("AA 30 301", "BMW", "i4", 5, 69, 486));

        garage.addCar(new DieselCar("AA 40 401", "Aston Martin", "DBX V8", 5, 7, true));
        garage.addCar(new DieselCar("AA 50 501", "Hyundai", "i30", 5, 27, true));
        garage.addCar(new DieselCar("AA 60 601", "Ford", "Cuga 2,0", 5, 18, true));

        garage.addCar(new GasolineCar("AA 70 701", "Mazda", "CX-5 2.0", 5, 17));
        garage.addCar(new GasolineCar("AA 80 801", "Peugeot", "3008", 5, 18));
        garage.addCar(new GasolineCar("AA 90 901", "Lamborghini", "data", 5, 8));

        System.out.println(garage);

        int totalRegistartionFee = garage.getTotalRegistrationFee();
        System.out.println("\n Registrationfee for all the cars combined is: " + totalRegistartionFee);


    }
}