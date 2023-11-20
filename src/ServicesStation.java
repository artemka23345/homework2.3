public  class ServicesStation {

    public static void checkTransport(GroundTransport gt){
        System.out.println("Обслуживаем " + gt.getModelName());
        for (int i = 0; i < gt.getWheelsCount(); i++) {
            gt.updateTyre();
        }
        gt.check();
    }
}
