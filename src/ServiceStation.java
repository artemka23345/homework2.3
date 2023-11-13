public class ServiceStation {

    public static void check(GroundTransport gt) {
        if (gt != null && gt instanceof Car) {
            Car car = (Car)gt;

            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();

        }else if (gt != null && gt instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) gt;
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }else if (gt != null && gt instanceof Truck) {
            Truck truck = (Truck) gt;
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public static void check(GroundTransport gt1,GroundTransport gt2) {
        check(gt1);
        check(gt2);
    }
    public static void check(GroundTransport gt1,GroundTransport gt2,GroundTransport gt3) {
        check(gt1,gt2);
        check(gt3);
    }
}
