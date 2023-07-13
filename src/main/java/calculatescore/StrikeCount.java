package calculatescore;

public class StrikeCount {
	protected int[] strikeCount(int randomNumber, int compareNumber) { 
    	int[] strikeCount = new int[] {0, 0};
        if(compareNumber==0) {
        	strikeCount = new int[] {randomNumber, 1};
        }
        return strikeCount;
    }
}
