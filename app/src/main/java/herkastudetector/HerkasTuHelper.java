package herkastudetector;

public class HerkasTuHelper {
    public static final String ECES_SUB_STRING = "AIDS";

    public static final int RET_SORAINAK_SZAMA = 3;
    public static final int RET_OSZLOPAINAK_SZAMA = 3;

    static void printeldKiARetet(String[][] ret) {
        for (int i = 0; i < RET_SORAINAK_SZAMA; i++) {
            for (int j = 0; j < RET_OSZLOPAINAK_SZAMA; j++) {
                StringBuilder builder = new StringBuilder();

                builder.append("Az ");
                builder.append(i + 1);
                builder.append(". sor ");
                builder.append(j + 1);
                builder.append(". oszlopban van: ");
                builder.append(ret[i][j]);

                System.out.println(builder.toString());
                // System.out.println("Az " + (i + 1) + ". sor " + (j + 1) + ". oszlopban van: "
                // + ret[i][j]);
            }
        }
    }

    static String holATu(String[][] ret) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < RET_SORAINAK_SZAMA; i++) {
            for (int j = 0; j < RET_OSZLOPAINAK_SZAMA; j++) {
                if (ret[i][j].contains(HerkasTuHelper.ECES_SUB_STRING)) {
                    builder.append("Az ");
                    builder.append(i + 1);
                    builder.append(". sor ");
                    builder.append(j + 1);
                    builder.append(". oszlopban van az ");
                    builder.append(HerkasTuHelper.ECES_SUB_STRING);
                }
            }
        }

        return builder.reverse().toString();
    }
}
