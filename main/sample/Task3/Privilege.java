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
/**
 * public enum State {
 * NEW_SOUTH_WALES{
 *
 * @Override public String toString() {
 * return "New South Wales";
 * }
 * },
 * AUSTRALIAN_CAPITAL_TERRITORY{
 * @Override public String toString() {
 * return "Australian Capital Territory";
 * }
 * },
 * VICTORIA{
 * @Override public String toString() {
 * return "Victoria";
 * }
 * },
 * QUEENSLAND{
 * @Override public String toString() {
 * return "Queensland";
 * }
 * },
 * SOUTH_AUSTRALIA{
 * @Override public String toString() {
 * return "South Australia";
 * }
 * },
 * WESTERN_AUSTRALIA{
 * @Override public String toString() {
 * return "Western Australia";
 * }
 * },
 * TASMANIA{
 * @Override public String toString() {
 * return "Tasmania";
 * }
 * },
 * NORTHERN_TERRITORY{
 * @Override public String toString() {
 * return "Northern Territory";
 * }
 * },
 * <p>
 * }
 */