import com.generics.MaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    @Test
    void givenThreeInteger_WithMaxAtFirstPlace_ReturnMaximum() {
        Integer maximum = MaximumNumber.maximumInteger(3, 2, 1);
        Assertions.assertEquals(3, maximum);
    }

    @Test
    void givenThreeInteger_WithMaxAtSecondPlace_ReturnMaximum() {
        Integer maximum = MaximumNumber.maximumInteger(2, 3, 1);
        Assertions.assertEquals(3, maximum);
    }

    @Test
    void givenThreeInteger_WithMaxAtThirdPlace_ReturnMaximum() {

        Integer maximum = MaximumNumber.maximumInteger(1, 2, 3);
        Assertions.assertEquals(3, maximum);
    }

    @Test
    void givenThreeFloat_WithMaxAtFirstPlace_ReturnMaximum() {
        Float maximum = MaximumNumber.maximumFloat(3.3f, 3.2f, 3.1f);
        Assertions.assertEquals(3.3f, maximum);
    }

    @Test
    void givenThreeFloat_WithMaxAtSecondPlace_ReturnMaximum() {
        Float maximum = MaximumNumber.maximumFloat(3.3f, 3.4f, 3.1f);
        Assertions.assertEquals(3.4f, maximum);
    }

    @Test
    void givenThreeFloat_WithMaxAtThirdPlace_ReturnMaximum() {
        Float maximum = MaximumNumber.maximumFloat(3.3f, 3.2f, 3.5f);
        Assertions.assertEquals(3.5f, maximum);
    }

}
