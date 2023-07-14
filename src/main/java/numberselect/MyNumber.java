package numberselect;

import java.util.Scanner;

public class MyNumber {
    public int myNumberSelect() {
        int myNumber=0;
        Scanner scanner = new Scanner(System.in);
        boolean myNumberJudgment = false;
        while (!myNumberJudgment) {
            System.out.println("0이 들어가지 않고 중복되지 않는 3자리 숫자를 입력하시오.");
            myNumber = scanner.nextInt();
            myNumberJudgment= myNumberJudgment(myNumber);
        }
        return myNumber;
    }
    private boolean myNumberJudgment(int myNumber) {
        if(myNumber>100 && myNumber%10 != 0 && (myNumber/10)%10 != 0 && myNumber<1000) {
        	return myNumberDuplicationPrevention(myNumber);
        }
        System.err.println("입력이 잘못됬습니다.");
        return false;
    }
    private boolean myNumberDuplicationPrevention (int myNumber) {
        if(myNumber/100 != (myNumber/10)%10 && (myNumber/10)%10 != myNumber%10 && myNumber/100 != myNumber%10 ) {
            return true;
        }
        System.err.println("입력이 잘못됬습니다.");
        return false;
    }
}
