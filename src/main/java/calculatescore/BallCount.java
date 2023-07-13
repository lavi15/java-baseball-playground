package calculatescore;

public class BallCount {
	protected int ballCount(int randomNumber, int[] myNumberArray) {
		int ballCount = 0;
        for(int i=0; i<myNumberArray.length; i++) {
        	ballCount+=ballCountLogic(randomNumber, myNumberArray[i]);
        }
        return ballCount;
    }
	
	private int ballCountLogic(int randomNumber, int myNumberArray) {
		if(randomNumber==myNumberArray) {
			return 1;
		}
		return 0;
	}
}
