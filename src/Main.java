public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("дуся", 10, 1, 30);
        animal.run(30);

        animal = new Horse("дуся", 10, 1, 30);
        animal.run(30);
        animal.swim(40);

        animal = new Dog("дуся", 10, 1, 30);
        animal.run(30);
        animal.swim(40);
    }
}