import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    private static int roll() {
        Random random = new Random();

        return (int) Math.round(6 * random.nextDouble());
    }

    public static int rollStat() {
        ArrayList<Integer> d6 = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            d6.add(roll());
        }

        Collections.sort(d6, Collections.reverseOrder());

        int summa = 0;

        for (int i = 0; i < 3; i++) {
            summa += d6.get(i);
        }

        return summa;
    }
}