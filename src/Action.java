public enum Action {
    Build{
        @Override
        public String toString() {
            return "want to build";
        }
    },
    Stretch_clothesline{
        @Override
        public String toString(){
            return Items.CLOTHESLINE +  " several times";
        }
    },
    Open_door{
        @Override
        public String toString(){
            return "opened the door with a " + Items.LONG_WIRE;
        }
    },
    Climb{
        @Override
        public String toString(){
            return "had climbed into the";
        }
    },
    Tangled{
        @Override
        public String toString(){
            return Action.Tangled + "up in the outstretched rope.";
        }
    }

}