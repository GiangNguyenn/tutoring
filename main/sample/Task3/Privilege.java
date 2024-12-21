package sample.Task3;

public enum Privilege {
    GUEST {
        @Override
        public String toString() {
            return "Guest";
        }
    },
    SILVER {
        @Override
        public String toString() {
            return "Silver";
        }
    },
    GOLD {
        @Override
        public String toString() {
            return "Gold";
        }
    },
    DIAMOND {
        @Override
        public String toString() {
            return "Diamond";
        }
    };
}