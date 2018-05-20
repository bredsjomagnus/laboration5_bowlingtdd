public class Bowling {
    private int[] bonus;
    private int[][] game = new int[10][2];
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

    public boolean setGame(int[][] scoreboard) {
        boolean gameset = false;
        for(int x = 0; x < scoreboard.length; x++) {
            int[] frame = getFrame(scoreboard[x][0], scoreboard[x][1]);
            game[x] = frame;
        }
        if(game.length == 10) {
            gameset = true;
        }
        return gameset;
    }

    public int[][] getGame() {
        System.out.println("Game length is: " + game.length);
        return game;
    }

    public void setBonus(int[] bonusRound) {
        this.bonus = bonusRound;
    }

    public int getGameScore() {
        int total = 0;
        boolean spare = false;
        boolean strike = false;
        for (int i = 0; i < this.game.length; i++) {
            if (spare) {
                total += this.game[i][0];
                spare = false;
            }
            if (strike) {
                total += this.game[i][0];
                total += this.game[i][1];
                strike = false;
            }

            total += this.game[i][0];
            total += this.game[i][1];

            if (this.game[i][0] == 10) {
                strike = true;
                if (i == 9) {
                    total += bonus[0];
                    total += bonus[1];
                    break;
                }
                if (this.game[i+1][0] == 10) {
                    if (i + 2 < 10) {
                        total += this.game[i+2][0];
                    } else {
                        total += this.game[i+1][0];
                    }
                    strike = true;
                }
            } else if (this.game[i][0] + this.game[i][1] == 10) {
                spare = true;
                if (i == 9) {
                    total += this.bonus[0];
                }
            }
        }

        return total;
    }
}
