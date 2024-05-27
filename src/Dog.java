public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public int run(int distance) {

        int time = distance / super.getSpeedRun();
        if (super.getStamina() - distance >= 0) {
            return time;
        } else {
            System.out.print("Животное устало\n " + " время: ");
            return -1;
        }
    }

    @Override
    public int swim(int distance) {
        if (super.getStamina() - (distance * 2) >= 0) {
            return distance / getSpeedSwim();
        } else {
            System.out.print("Животное устало\n" + "время: ");
            return -1;
        }
    }
}