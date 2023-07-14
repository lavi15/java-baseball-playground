package gamelogic;

public class GameNarration {
    protected void gameNarration(int[] calculateScore) {
        if(calculateScore[0]>0 && calculateScore[1] >0){
            System.out.println(calculateScore[0]+"스트라이크"+calculateScore[1]+"볼");
        }
        if(calculateScore[0]>0 && calculateScore[1] == 0){
            System.out.println(calculateScore[0]+"스트라이크");
        }
        if(calculateScore[0]==0 && calculateScore[1] >0){
            System.out.println(calculateScore[1]+"볼");
        }
        if(calculateScore[0]==0 && calculateScore[1]==0){
        	System.out.println("낫싱");
        }
    }
}
