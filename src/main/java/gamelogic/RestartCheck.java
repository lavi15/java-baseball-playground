package gamelogic;

import java.util.Scanner;
public class RestartCheck {
    protected int restartCheck(int calculateScore) {
    	int restartCheck = 1;
        if(calculateScore==3) {
            restartCheck =restartChecker();
        }
        return restartCheck;
    }

    private int restartChecker() {
        int restartChecker=0;
        Scanner scanner = new Scanner(System.in);
        while (restartChecker!=1 && restartChecker!=2) {
            System.out.println("게임을 계속 하려면 1번을 종료하려면 2번을 입력해 주세요.");
            restartChecker = scanner.nextInt();
        }
        return restartChecker;
    }

}
