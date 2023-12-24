public class Car {
    private String model;
    private Engine carEngine;

    public Car(String model) {
        this.model = model;
        this.carEngine = new Engine();
    }

    class Engine {
        private int horsePower = 100;

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }

    public void display() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Engine power: " + this.carEngine.horsePower);
    }

    public Engine getCarEngine() {
        return carEngine;
    }
}
