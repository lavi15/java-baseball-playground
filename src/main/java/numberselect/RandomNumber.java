package numberselect;

import java.util.Random;

public class RandomNumber {
    public int[] randomNumberSelect() {
        Random random = new Random();
        int[] randomNumber = random.ints(1, 9).limit(3).toArray();
        return randomNumber;
    }
}
