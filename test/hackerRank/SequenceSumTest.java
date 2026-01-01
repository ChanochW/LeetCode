package hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequenceSumTest {
    @Test
    void sequenceTest() {
        SequenceSum sequenceSum = new SequenceSum();
        sequenceSum.solve();
        assertEquals(56, sequenceSum.getAnswer());
    }
}
