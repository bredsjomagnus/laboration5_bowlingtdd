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

			int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};
			int[][] testgame = bowling.setGame(game);

			assertEquals(10, testgame.length);
		}

        @Test
        public void gameScoreTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{1, 5}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};


            assertEquals(81, bowling.getGameScore(game));
        }

        @Test
        public void gameStrikeScoreTest() {
            Bowling bowling = new Bowling();
            int[][] game = {{10, 0}, {3, 6}, {7, 2}, {3, 6}, {4, 4}, {5, 3}, {3, 3}, {4, 5}, {8, 1}, {2, 6}};

            assertEquals(94, bowling.getGameScore(game));
        }
    }
}
