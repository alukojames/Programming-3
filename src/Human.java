public abstract class Human {

    private final String name;
    private double HP; // HP is the double in range from 0 to 1
    Human(String name, double HP) {
        this.name = name;
        this.HP = HP;
    }
    public String getName(){
        return this.name;}
    public double getHP(){
        return this.HP;}
    public void setHP(double newHP){
        this.HP = newHP;
    }
}