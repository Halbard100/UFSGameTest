public class BaseCard {
    protected String name;
    protected int id;
    protected int control;
    protected int difficulty;

    public BaseCard(){

    }
    public BaseCard(String name, int id, int control, int difficulty){
        setName(name);
        setId(id);
        setControl(control);
        setDifficulty(difficulty);
    }

    void setName(String name_in){
        name = name_in;
    }
    void setId(int id_in){
        id = id_in;
    }
    void setControl(int control_in){
        control = control_in;
    }
    void setDifficulty(int difficulty_in){
        difficulty = difficulty_in;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

}
