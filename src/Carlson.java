import java.util.Objects;

public class Carlson extends Human implements Ibuild, IstretchClothesline{
    private Locations location;

    Carlson(String name, double HP, Locations location) {
        super(name,HP);
        this.location = location;
    }

    //Carlson(String name, double HP, Locations l) {
      //  super(name, HP);
        //this.location = l;
    //}

    public boolean position(Locations where) {
        if (where.equals(Locations.HALLWAY)) {
            System.out.println(this.getName() + " " + "was in the" + " " + where );
            return true;
        } else {
            System.out.println(this.getName() + " is not in the" + where);
            return false;
        }
    }

    @Override
    public boolean build(Action what){
        if (what.equals(Action.Build)){
        System.out.println(this.getName() + " began to build a very cunning " + Items.TRAP + " for thieves.");
        return true;}
        //return this.getName() + " began to build a very cunning" + what + " for thieves."
        else {
            System.out.println(this.getName() + " wasnt building anything   ");
            return false;
        }
    }

    public boolean stretchCLothesLine(Action what){
        if (what.equals(Action.Stretch_clothesline)){
            System.out.println(this.getName() + " stretched the" + what + " several times between the chairs at a low height.");
            return true;}
        //return this.getName() + " began to build a very cunning" + what + " for thieves."
        else {
            System.out.println(this.getName() + " wasnt streteching anything   ");
            return false;
        }
    }
    public void instance(){
        System.out.println("Now if any thief enters the door in the dark, he will surely fall");
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getName(),this.getHP());
    }


    @Override
    public boolean Stretch_clothesline(Action how) {
        return false;
    }

    public boolean carlsonWithChairs(Items what){
        if (what.equals(Items.Chairs)) {
            System.out.println(Items.Chairs + "and now");
            return true;
        }
        else {
            System.out.println(this.getName() + " there were no even chairs there.   ");
            return false;
        }
    }
}
