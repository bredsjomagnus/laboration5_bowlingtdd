import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.experimental.runners.Enclosed;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Enclosed.class)
public class BowlingTest {

    public static class BowlingSingelTest {
		@Test
		public void frametest() {
            Bowling bowling = new Bowling();
            int throwone = 2;
			int throwtwo = 5;
            int[] frame = bowling.getFrame(throwone, throwtwo);

			assertArrayEquals(new int[]{2, 5}, frame);
        }

		@Test
		public void framescoretest() {
            Bowling bowling	= new Bowling();
            int[] frame = bowling.getFrame(2,5);
            int score = bowling.getFrameScore(frame);

            assertEquals(7, score);
        }

		@Test
		public void gametest() {
			Bowling bowling = new Bowling();

			int[][] scoreboard = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
			boolean gameset = bowling.setGame(scoreboard);

			assertEquals(true, gameset);
		}

        @Test
        public void gameScoreTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
			bowling.setGame(game);


            assertEquals(81, bowling.getGameScore());
        }

        @Test
        public void gameStrikeScoreTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{10, 0}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
            bowling.setGame(game);

            assertEquals(94, bowling.getGameScore());
        }

        @Test
        public void gameSpareScoreTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 9}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
            bowling.setGame(game);

            assertEquals(88, bowling.getGameScore());
        }

        @Test
        public void gameScoreFullTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{10, 0}, {4, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
            bowling.setGame(game);

            assertEquals(103, bowling.getGameScore());
        }

        @Test
        public void gameScoreMultipleStrikes() {
            Bowling bowling = new Bowling();
            int[][] game = {{10, 0}, {10, 0}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4,5}, {8, 1}, {2, 6}};
            bowling.setGame(game);

            assertEquals(112, bowling.getGameScore());
		}

        @Test
        public void gameScoreMultipleSpares() {
            Bowling bowling = new Bowling();
            int[][] game = {{8, 2}, {5, 5}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
            bowling.setGame(game);

            assertEquals(98, bowling.getGameScore());
        }

        @Test
        public void gameScoreLastSpares() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 8}};
            bowling.setGame(game);
            int[] bonus = {7};
            bowling.setBonus(bonus);

            assertEquals(90, bowling.getGameScore());
        }

        @Test
        public void gameScoreLastStrike() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {10, 0}};
            bowling.setGame(game);
            int[] bonus = {7, 2};
            bowling.setBonus(bonus);

            assertEquals(92, bowling.getGameScore());
        }

        @Test
        public void gameScoreBonusIsStrike() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 8}};
            bowling.setGame(game);
            int[] bonus = {10};
            bowling.setBonus(bonus);

            assertEquals(93, bowling.getGameScore());
        }

        @Test
        public void gameScoreAllStrikes() {
            Bowling bowling = new Bowling();
            int[][] game = {{10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}, {10, 0}};
            bowling.setGame(game);
            int[] bonus = {10, 10};
            bowling.setBonus(bonus);

            assertEquals(300, bowling.getGameScore());
        }

        @Test
        public void gameScoreRealGame() {
            Bowling bowling = new Bowling();
            int[][] game = {{6, 3}, {7, 1}, {8, 2}, {7, 2}, {10, 0}, {6, 2}, {7, 3}, {10, 0}, {8, 0}, {7, 3}};
            bowling.setGame(game);
            int[] bonus = {10};
            bowling.setBonus(bonus);

            assertEquals(135, bowling.getGameScore());
        }
    }
}
