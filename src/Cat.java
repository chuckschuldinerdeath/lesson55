public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кошка не плавает");
        return 0;
    }
}