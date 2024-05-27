public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public void info() {
        System.out.println("name: " + super.getName() + " speedRun: " + super.getSpeedRun() + " stamina: " + super.getStamina());
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кошка не плавает");
        return 0;
    }
}