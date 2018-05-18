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
            // assertEquals(2, frame[0]);
            // assertEquals(5, frame[1]);
			assertArrayEquals(new int[]{2, 5}, frame);
        }
    }
}
