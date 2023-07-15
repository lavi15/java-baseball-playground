package calculatescore;

import org.junit.jupiter.api.Test;

class CalculateScore {

	@Test
	void CalculateScoreTest() {
		int[] randomNumber = new int[] {1,2,3};
		int[] myNumberArray = new int[] {1,2,3};
		int[] screcalculateScore(randomNumber, myNumberArray};
		assertEquals(3, score[0]);
	}

    public int[] calculateScore(int[] randomNumber, int[] myNumberArray) {
	int[] CalculateScore = new int[] {0,0};
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			if(randomNumber[i]==myNumberArray[j]) {
				if(i==j) {
					CalculateScore[0]+=1;
				}
				if(i!=j) {
					CalculateScore[1]+=1;
				}
			}
		}
	}
    return CalculateScore;
   }
}

