package gamelogic;

import calculatescore.CalculateScore;
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
        int[] randomNumber = randomnumber.randomNumberSelect();
        int gameStarter = 1;
        while (gameStarter == 1) {
            int myNumber = mynumber.myNumberSelect();
            int[] myNumberArray = new int[] {myNumber/100, (myNumber/10)%10, myNumber%10};
            int[] calculateScore = score.calculateScore(randomNumber, myNumberArray);
            narration.gameNarration(calculateScore);
            gameStarter = restartCheck.restartCheck(calculateScore[0]);
            randomNumber = randomnumber.resetRandomNumber(calculateScore[0], randomNumber);
        }
    }
}
