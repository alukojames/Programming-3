public class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson("Carlson",1.0, Locations.HALLWAY);
        FilleAndRulle filleandrulle = new FilleAndRulle("FileandRulle", 1.0, Locations.OUTSIDE);
        System.out.println();
        carlson.position(Locations.HALLWAY);
        carlson.build(Action.Build);
        carlson.stretchCLothesLine(Action.Stretch_clothesline);
        carlson.instance();
        filleandrulle.robbed(Locations.HALLWAY, Action.Climb);
        filleandrulle.opened(Action.Open_door);
        filleandrulle.Instance();
        filleandrulle.secondInstance();

    }
}






















