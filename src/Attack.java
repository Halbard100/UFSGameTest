public class Attack extends BaseCard {

    int printedDamage;
    int printedSpeed;
    int currentDamage;
    int currentSpeed;

    public Attack(){
    }

    public Attack(String name, int id, int control, int difficulty){
        super(name, id, control, difficulty);
    }

    public Attack(String name, int id, int control, int difficulty, int speed, int damage){
        super(name, id, control, difficulty);
        setSpeed(speed);
        setDamage(damage);
    }

    void setSpeed(int speed_in){
        printedSpeed = speed_in;
        currentSpeed = printedSpeed;
    }

    void setDamage(int damage_in){
        printedDamage = damage_in;
        currentDamage = printedDamage;
    }

    public int getPrintedDamage(){
        return printedDamage;
    }

    public int getCurrentDamage(){
        return currentDamage;
    }

    public int getPrintedSpeed(){
        return printedSpeed;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public String toString(){
        return super.toString();
    }
}
