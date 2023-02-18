public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            System.out.println("");

            Car audi = new Car("AUDI", "A8 50 L TDI quattro", 3.0);
            Car bmw = new Car("BMW", "Z8", 3.0);
            Car kia = new Car("Kia", "Sportage 4", 2.4);
            Car hyundai = new Car("Hyundai", "Avante", 1.6);

            Truck scania = new Truck("Scania", "R520", 16);
            Truck volvo = new Truck("Volvo", "FM13", 13);
            Truck man = new Truck("Man", "TGS 41.440", 12);
            Truck renault = new Truck("Renault", "K 520", 13);

            Bus liaz = new Bus("ЛиАЗ", "5292", 4.4);
            Bus yutong = new Bus("Yutong", "ZK6128HC", 9.7);
            Bus higer = new Bus("Higer", "KLQ6128LQ", 9.5);
            Bus mersedes = new Bus("Mercedes-Benz", "Sprinter", 2.2);

            service(audi, bmw, kia, hyundai,
                    scania, volvo, man, renault,
                    liaz, yutong, higer, mersedes);
        }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
            }
        }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}