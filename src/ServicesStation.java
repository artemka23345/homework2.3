public  class ServicesStation {

    public static void checkTransport(GroundTransport gt){
        System.out.println("Обслуживаем " + gt.getModelName());
        for (int i = 0; i < gt.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        gt.check();
    }

    public static void checkTransport(GroundTransport gt,GroundTransport gt2){
        checkTransport(gt);
        checkTransport(gt2);
    }
    public static void checkTransport(GroundTransport gt,GroundTransport gt2,GroundTransport gt3){
        checkTransport(gt,gt2);
        checkTransport(gt3);

    }
}
