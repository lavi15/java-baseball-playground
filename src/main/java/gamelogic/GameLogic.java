package gamelogic;

import calculatescore.CalculateScore;
import numberselect.MyNumber;
import numberselect.RandomNumber;

public class GameLogic {
    public void gameLogic() {
        RandomNumber randomnumber = new RandomNumber();
        MyNumber mynumber = new MyNumber();
        GameNarration narration = new GameNarration();
        RestartCheck restartCheck = new RestartCheck();
        CalculateScore score = new CalculateScore();
        int gameStarter = 2;
        int[] randomNumber = randomnumber.randomNumberSelect();
        while (gameStarter == 2) {
            int myNumber = mynumber.myNumberSelect();
            int[] myNumberArray = new int[] {myNumber/100, (myNumber/10)%10, myNumber%10};
            int[] calculateScore = score.calculateScore(randomNumber, myNumberArray);
            System.out.println("randomNumber"+randomNumber[0]+randomNumber[1]+randomNumber[2]);
            System.out.println("strike"+calculateScore[0]);
            System.out.println("ball"+calculateScore[1]);
            narration.gameNarration(calculateScore);
            gameStarter = restartCheck.restartCheck(calculateScore[0]);
        }
    }
}
