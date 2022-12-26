public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется");
        return true;
    }

    @Override
    public void startMoving() {
        System.out.println("Bus " + getModel() + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Bus " + getModel() + " закончил движение!");
    }

    @Override
    public void pitSpot() {
        System.out.println("Bus " + getModel() + " заехал на питстоп");
    }

    @Override
    public void bestTimeOfRound() {
        System.out.println("Лучшее время круга у Bus " + getModel());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у Bus " + getModel());

    }
}