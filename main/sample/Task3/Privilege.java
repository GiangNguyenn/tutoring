package sample.Task3;

public enum Privilege {
    GUEST,
    SILVER,
    GOLD,
    DIAMOND;

    @Override
    public String toString() {
        switch (this) {
            case GUEST:
                return "Guest";
            case SILVER:
                return "Silver";
            case GOLD:
                return "Gold";
            case DIAMOND:
                return "Diamond";
            default:
                return "ERROR";
        }
    }
}