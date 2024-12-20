
public class ProgramSummary {
    public static void main(String[] args) {
        final int[][] timesTable = new int[12][];

        for (int i = 0; i < 12; i++) {
            int[] row = new int[12];
            for (int j = 0; j < 12; j++) {
                row[j] = (i + 1) * (j + 1);
            }
            timesTable[i] = row;
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%4d", timesTable[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", timesTable[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < timesTable[i].length - i; j++) {
                System.out.printf("%4d", timesTable[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            for (int j = 10; j > i; j--) {
                System.out.printf("%-4d", timesTable[i][j + 1]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < 12; i++) {
            for (int j = 11; j >= timesTable.length - i; j--) {
                System.out.printf("%4d", timesTable[i - 1][j]);
            }
            System.out.println();
        }
    }
}