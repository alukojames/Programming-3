import java.util.Objects;

public class FilleAndRulle extends Human implements Imotions{
    private Locations location;

    FilleAndRulle(String name, double HP, Locations location) {
        super(name, HP);
        this.location = location;
    }

    public boolean robbed(Locations where, Action which) {
        if (where.equals(Locations.HALLWAY)&& which.equals(Action.Climb)) {
            System.out.println(this.getName() + " " + which + where + "last year to rob them.");
            this.setHP(0.7);
            System.out.println("Now" + " " + this.getName() + "HP's are reduced to: " + this.getHP());
            return true;
        } else {
            System.out.println(this.getName() + " didn't go to the apartment");
            return false;
        }
    }

    public boolean opened(Action what) {
        if (what.equals(Action.Open_door)) {
            System.out.println(this.getName() + " " + what + ",by hooking up the dog of the lock to get through the " + Items.DOOR + ".");
            return true;
        } else {
            System.out.println(this.getName() + " were at home");
            return false;
        }
    }
    public void Instance(){
        System.out.println("Maybe this time " + this.getName() + "will want to get into the apartment in the same way.");
    }

    public void secondInstance(){
        System.out.println("It will only be fair if they get tangled up in the outstretched " + Items.ROPE +"." + "and");
    }

    @Override
    public boolean returned(Locations location) {
        return false;
    }
}

