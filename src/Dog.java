public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public int run(int distance) {

        int time = distance / super.getSpeedRun();
        if (super.getStamina() - distance >= 0) {
            System.out.println(time);
            return time;
        } else {
            System.out.print("Животное устало " + "время: " + -1 + "\n");
            return -1;
        }
    }

    @Override
    public int swim(int distance) {
        if (super.getStamina() - (distance * 2) >= 0) {
            return distance / getSpeedSwim();
        } else {
            System.out.print("Животное устало " + "время: " + -1 + "\n");
            return -1;
        }
    }
}