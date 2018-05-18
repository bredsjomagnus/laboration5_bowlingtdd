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

    public int getGameScore(int[][] scoreboard) {
        int total = 0;
        for (int i = 0; i < scoreboard.length; i++) {
            total += scoreboard[i][0];
            total += scoreboard[i][1];
        }

        return total;
    }

    public int getGameWithStrike(int[][] scoreboard) {
        int total = 0;
        boolean strike = false;
        for (int i = 0; i < scoreboard.length; i++) {
            if (strike) {
                total += scoreboard[i][0];
                total += scoreboard[i][1];
                strike = false;
            }

            total += scoreboard[i][0];
            total += scoreboard[i][1];

            if (scoreboard[i][0] == 10) {
                strike = true;
            }
        }

        return total;
    }
}
