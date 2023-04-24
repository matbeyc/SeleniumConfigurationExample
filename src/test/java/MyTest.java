import io.github.artsok.RepeatedIfExceptionsTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class MyTest {
    @ParameterizedTest
    @CsvSource({"2,2,", "3,3,", "4,3"})
    public void firstTest(Integer actual, Integer expected) {
        Assertions.assertEquals(expected, actual);
    }
}