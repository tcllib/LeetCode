package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyTest {
    @Test
    void name() {
        Fly fly = new Fly();
        String[][] input = new String[5][5];
        input[0] = new String[]{"2", "2"};
        input[1] = new String[]{"G", "-", "G", "R", "-"};
        input[2] = new String[]{"G", "-", "-", "F", "G"};
        input[3] = new String[]{"F", "G", "-", "-", "R"};
        input[4] = new String[]{"R", "G", "F", "-", "-"};
        String[][] output = fly.test(input);

        assertEquals("G",output[0][0]);
        assertEquals("G",output[0][1]);
        assertEquals("R",output[1][0]);
        assertEquals("F",output[1][1]);
    }
}
