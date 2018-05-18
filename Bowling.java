public class Bowling {
    /**
    * @param args
    */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        System.out.print("Started");
    }

	public int[] getFrame(int throwone, int throwtwo) {
		int[] frame = new int[2];
		frame[0] = throwone;
		frame[1] = throwtwo;
		return frame;
	}

	public int getFrameScore(int[] frame) {
		int score = frame[0] + frame[1];
		return score;
	}
}
