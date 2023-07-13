package calculatescore;

public class CalculateScore {
	public int[] calculateScore(int[] randomNumber, int[] myNumberArray) {
		StrikeCount strike = new StrikeCount();
		BallCount ball = new BallCount();
    	int[] CalculateScore = new int[] {0,0};
    	int[] compareNumber = new int[randomNumber.length];
        for(int i=0; i<compareNumber.length; i++) {
        	compareNumber[i]=randomNumber[i]-myNumberArray[i];
        }
        for(int i=0; i<randomNumber.length; i++) {
    		int[] strikeCount = strike.strikeCount(randomNumber[i], compareNumber[i]);
    		randomNumber[i]-=strikeCount[0];
    		CalculateScore[0]+=strikeCount[1];
    	}
        for(int i=0; i<randomNumber.length; i++) {
        	CalculateScore[1]+=ball.ballCount(randomNumber[i], myNumberArray);
    	}
        System.out.println("strike"+CalculateScore[0]);
        System.out.println("ball"+CalculateScore[1]);
        return CalculateScore;
    }
}
