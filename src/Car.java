public class Car extends GroundTransport implements EngineBeingTested{


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        checkTransport();
        checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
