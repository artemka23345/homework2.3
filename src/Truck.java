public class Truck extends GroundTransport implements EngineBeingTested,Freight{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();

    }
}
