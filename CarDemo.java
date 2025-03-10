class Car {
    String brand;
    int speed;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.displayInfo();
    }
}
