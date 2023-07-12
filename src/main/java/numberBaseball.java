import java.util.Random;
import java.util.Scanner;

public class numberBaseball {
    private int[] randomNumberSelect() {
        Random random = new Random();
        int[] randomNumber = random.ints(1, 9).limit(3).toArray();
        return randomNumber;
    }

    public int myNumberSelect() {
        int myNumber=0;
        Scanner scanner = new Scanner(System.in);
        boolean myNumberSelectJudgment = false;
        while (!myNumberSelectJudgment) {
            System.out.println("0이 들어가지 않는 3자리 숫자를 입력하시오.");
            myNumber = scanner.nextInt();
            myNumberSelectJudgment=myNumberSelectJudgment(myNumber);
        }
        return myNumber;
    }

    public boolean myNumberSelectJudgment(int myNumber) {
        if(myNumber>100 && myNumber%10 != 0 && (myNumber/10)%10 != 0) {
            return true;
        }
        System.err.println("입력이 잘못됬습니다.");
        return false;
    }

    public void gameLogic() {
        int gameStarter = 2;
        int[] randomNumber = randomNumberSelect();
        while (gameStarter == 2) {
            int myNumber = myNumberSelect();
            int[] myNumberArray = {myNumber/100, (myNumber/10)%10, myNumber%10};
            int[] gameScore = gameScore(randomNumber, myNumberArray);
            gameNarration(gameScore);
            gameStarter = restartGame(gameScore[0]);
        }
    }

    public int restartGame(int gameScore) {
        if(gameScore==3) {
            restartGameSelect();
        }
        return 2;
    }

    public int restartGameSelect() {
        int restartGameSelecter=0;
        Scanner scanner = new Scanner(System.in);
        while (restartGameSelecter!=1 || restartGameSelecter!=2) {
            System.out.println("게임을 계속 하려면 1번을 종료하려면 2번을 입력해 주세요.");
            restartGameSelecter = scanner.nextInt();
        }
        return restartGameSelecter;
    }

    public void gameNarration(int[] gameScore) {
        if(gameScore[0]>0 && gameScore[1] >0){
            System.out.print(gameScore[0]+"스트라이크"+gameScore[1]+"볼");
        }
        if(gameScore[0]>0 && gameScore[1] == 0){
            System.out.print(gameScore[0]+"스트라이크");
        }
        if(gameScore[0]==0 && gameScore[1] >0){
            System.out.print(gameScore[1]+"볼");
        }
        System.out.print("포볼");
    }

    public int[] gameScore(int[] randomNumber, int[] myNumberArray) {
        int[] score = new int[] {0,0};
        for(int i : randomNumber) {
            score[0]+=gameScoreStrike(randomNumber[i], myNumberArray[i]);
            score[1]+=gameScoreBall(randomNumber[i], myNumberArray);
        }
        score[1]-=score[0];
        return score;
    }

    public int gameScoreStrike(int randomNumber, int myNumberArray) {
        if(randomNumber == myNumberArray) {
            return 1;
        }
        return 0;
    }

    public int gameScoreBall(int randomNumber, int[] myNumberArray) {
        int scoreBall=0;
        for(int j : myNumberArray) {
            scoreBall+=gameScoreBallCount(randomNumber, myNumberArray[j]);
        }
        return scoreBall;
    }

    public int gameScoreBallCount(int randomNumber, int myNumberArray) {
        if(randomNumber == myNumberArray) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        numberBaseball game = new numberBaseball();
        game.gameLogic();
    }
}