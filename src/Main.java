public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("дуся кошка", 10, 1, 30);
        animal.info();
        animal.run(30);
        animal.swim(3);

        animal = new Horse("дуся лошадь", 10, 1, 90);
        animal.info();
        animal.run(90);
        animal.swim(40);

        animal = new Dog("дуся собака", 10, 1, 50);
        animal.info();
        animal.run(60);
        animal.swim(40);
    }
}