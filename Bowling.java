public class Bowling {
    /**
    * @param args
    */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        System.out.println("Started");
    }

	public static int[] getFrame(int throwone, int throwtwo) {
		int[] frame = new int[2];
		frame[0] = throwone;
		frame[1] = throwtwo;
		return frame;
	}

	public int getFrameScore(int[] frame) {
		int score = frame[0] + frame[1];
		return score;
	}

	public int[][] setGame(int[][] th) {
        int[][] testgame = new int[th.length][2];
        for(int x = 0; x < th.length; x++) {
            int[] frame = getFrame(th[x][0], th[x][1]);
            testgame[x] = frame;
        }
        return testgame;
    }

}
