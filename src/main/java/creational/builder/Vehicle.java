package creational.builder;

/**
 * Created by jarydu on 3/11/17.
 */
public class Vehicle {
    public enum Type {
        SEDAN, SUV, BUS, TRUCK, PICKUP;
    }

    public enum Brand {
        BMW, BENZ, JEEP, CHEVY, TOYOTA, CHERRY
    }

    public enum Color {
        RED, BLUE, GREEN, WHITE, BLACK
    }

    public enum Trans {
        AUTO, MANUAL
    }

    public enum Tire {
        RUBBER, SPECIAL;
    }

    private final Type type;
    private final Brand brand;
    private final int weight;
    private final Color color;
    private final int mileage;
    private final int year;
    private final Trans trans;
    private final Tire tire;

    private Vehicle(Builder buidler) {
        this.type = buidler.type;
        this.brand = buidler.brand;
        this.weight = buidler.weight;
        this.color = buidler.color;
        this.mileage = buidler.mileage;
        this.year = buidler.year;
        this.trans = buidler.trans;
        this.tire = buidler.tire;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", brand=" + brand +
                ", weight=" + weight +
                ", color=" + color +
                ", mileage=" + mileage +
                ", year=" + year +
                ", trans=" + trans +
                ", tire=" + tire +
                '}';
    }

    public static class Builder {

        private final Type type;
        private final Brand brand;
        private final Color color;
        private final Trans trans;
        private int year = 2016;
        private int weight = 1000;
        private int mileage = 10;
        private Tire tire = Tire.RUBBER;

        public Builder(Type type, Brand brand, Color color, Trans trans) {
            this.type = type;
            this.brand = brand;
            this.color = color;
            this.trans = trans;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder setTire(Tire tire) {
            this.tire = tire;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle.Builder(Type.SUV, Brand.BMW, Color.BLACK, Trans.AUTO)
                .setYear(2016)
                .setWeight(2000)
                .setMileage(100)
                .build();

        System.out.println("Vehicle: " + v);

    }
}
