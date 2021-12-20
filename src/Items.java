public enum Items {
    Chairs{
        @Override
        public String toString(){
            return "There were chairs on both sided of the hallway.";
        }
    },
    TRAP{
        @Override
        public String toString() {
            return "trap";
        }
    },
    CLOTHESLINE{
        @Override
        public String toString() {
            return "clothesline";
        }
    },
    DOOR{
        @Override
        public String toString() {
            return "door";
        }
    },
    LONG_WIRE{
        @Override
        public String toString() {
            return "long wire";
        }
    },

    ROPE{
        @Override
        public String toString() {
            return "rope";
        }
    }
}