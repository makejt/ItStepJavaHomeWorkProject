package by.itstep.makejt.javastages.stage11.task01.model.logic;

import java.util.Random;

public class HeadsOrTails {
    public static String countHeadsOrTails(int number) {
        Random random = new Random();
        int sumHeads = 0;
        int sumTails = 0;

        for (int i = 1; i <= number; i++) {
            int n = random.nextInt(2);
            if (n == 0) {
                sumHeads++;
            } else {
                sumTails++;
            }
        }
        return String.format("%d heads ana %d tails", sumHeads, sumTails);

    }
}
