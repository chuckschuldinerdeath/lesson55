public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("дуся кошка", 10, 1, 30);
        animal.run(30);
        animal.swim(3);
        animal.info();

        animal = new Horse("дуся лошадь", 10, 1, 30);
        animal.run(30);
        animal.swim(40);
        animal.info();

        animal = new Dog("дуся собака", 10, 1, 30);
        animal.run(30);
        animal.swim(40);
        animal.info();
    }
}