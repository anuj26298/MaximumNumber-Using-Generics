import com.generics.MaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    @Test
    void givenThreeInteger_WithMaxAtFirstPlace_RetrunMaximum() {
        Integer maximum = MaximumNumber.maximumInteger(3,2,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    void givenThreeeInteger_WithMaxAtSecondPlace_ReturnMaximum() {
        Integer maximum = MaximumNumber.maximumInteger(2,3,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    void givenThreeInteger_WithMaxAtThirdPlace_ReturnMaximum() {

        Integer maximum = MaximumNumber.maximumInteger(1,2,3);
        Assertions.assertEquals(3,maximum);
    }
}
