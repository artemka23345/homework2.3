public class Main {
    public static void main(String[] args) {
        GroundTransport car = new Car("car1",4);
        GroundTransport car2 = new Car("car2",4);

        GroundTransport truck = new Truck("truck1",6);
        GroundTransport truck2 = new Truck("truck2",8);


        GroundTransport bicycle = new Bicycle("bicycle1",2);
        GroundTransport bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation.check(car,bicycle,truck);
        ServiceStation.check(car2,bicycle2,truck2);

   }
}
