public abstract class Animal {
    private String name;
    private int speedRun;
    private int speedSwim;
    private int stamina;

    public Animal(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    public void info() {
        System.out.println("name: " + name + " speedRun: " + speedRun + " speedSwim: " + speedSwim + " stamina: " + stamina);
    }

    public int run(int distance){

        int time = distance/speedRun;
        if (stamina - distance >= 0) {
            return time;
        }else {
            System.out.print("Животное устало\n " + " время: ");
            return -1;
        }
    }

    public int swim(int distance){
        if (stamina - distance > 0){
            return distance/speedSwim;
        } else {
            System.out.print("Животное устало" + "время: ");
            return -1;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRun(){
        return speedRun;
    }
    public void setSpeedRun(int speedRun){
        this.speedRun = speedRun;
    }

    public int getSpeedSwim(){
        return speedSwim;
    }
    public void setSpeedSwim(int speedSwim){
        this.speedSwim = speedSwim;
    }

    public int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }

}
