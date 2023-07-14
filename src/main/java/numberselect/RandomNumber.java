package numberselect;

import java.util.Random;

public class RandomNumber {
    public int[] randomNumberSelect() {
        Random random = new Random();
        int[] randomNumber = random.ints(1, 9).limit(3).toArray();
        while(randomNumber[0]==randomNumber[1]) {
        	randomNumber[1]=random.nextInt(9)+1;
        }
        while(randomNumber[0]==randomNumber[2] || randomNumber[1]==randomNumber[2]) {
        	randomNumber[2]=random.nextInt(9)+1;
        }
        return randomNumber;
    }
    public int[] resetRandomNumber(int calculateScore, int[] randomNumber) {
        if(calculateScore==3) {
        	Random random = new Random();
            int[] resetRandomNumber = random.ints(1, 9).limit(3).toArray();
            while(resetRandomNumber[0]==resetRandomNumber[1]) {
            	resetRandomNumber[1]=random.nextInt(9)+1;
            }
            while(resetRandomNumber[0]==resetRandomNumber[2] || resetRandomNumber[1]==resetRandomNumber[2]) {
            	resetRandomNumber[2]=random.nextInt(9)+1;
            }
            return resetRandomNumber;
        }
        return randomNumber;
    }    
}
