package TheCompleteCodingInterviewGuide.UnitTesting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class sumTest {
    @BeforeEach
    void before() {
        System.out.println ("before testing");
    }
    @Test
    public void SumTest () {
        int result = IntStream.range ( 0, 11 ).sum ();

        assert result == 55;
    }
}
