import com.generics.MaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    @Test
    void givenThreeInteger_WithMaxAtFirstPlace_ReturnMaximum() {
        Integer maxInt = MaximumNumber.maximum(3, 2, 1);
        Assertions.assertEquals(3, maxInt);
    }

    @Test
    void givenThreeInteger_WithMaxAtSecondPlace_ReturnMaximum() {
        Integer maxInt = MaximumNumber.maximum(2, 3, 1);
        Assertions.assertEquals(3, maxInt);
    }

    @Test
    void givenThreeInteger_WithMaxAtThirdPlace_ReturnMaximum() {

        Integer maxInt = MaximumNumber.maximum(1, 2, 3);
        Assertions.assertEquals(3, maxInt);
    }

    @Test
    void givenThreeFloat_WithMaxAtFirstPlace_ReturnMaximum() {
        Float maxFloat = MaximumNumber.maximum(3.3f, 3.2f, 3.1f);
        Assertions.assertEquals(3.3f, maxFloat);
    }

    @Test
    void givenThreeFloat_WithMaxAtSecondPlace_ReturnMaximum() {
        Float maxFloat = MaximumNumber.maximum(3.3f, 3.4f, 3.1f);
        Assertions.assertEquals(3.4f, maxFloat);
    }

    @Test
    void givenThreeFloat_WithMaxAtThirdPlace_ReturnMaximum() {
        Float maxFloat = MaximumNumber.maximum(3.3f, 3.2f, 3.5f);
        Assertions.assertEquals(3.5f, maxFloat);
    }

    @Test
    void givenThreeString_WithMaxAtFirst_ReturnMaximum() {
        String maxString = MaximumNumber.maximum("abcd", "abc", "ab");
        Assertions.assertEquals("abcd", maxString);
    }

    @Test
    void givenThreeString_WithMaxAtSecond_ReturnMaximum() {
        String maxString = MaximumNumber.maximum("abc", "abcd", "ab");
        Assertions.assertEquals("abcd", maxString);
    }

    @Test
    void givenThreeString_WithMaxAtThird_ReturnMaximum() {
        String maxString = MaximumNumber.maximum("abcd", "abc", "abcdef");
        Assertions.assertEquals("abcdef", maxString);
    }

    @Test
    void givenThreeInteger_WithMaxAtFirstPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(3,2,1);
        Assertions.assertEquals(3, maximumNumber.testMaximumNumber());
    }
    @Test
    void givenThreeInteger_WithMaxAtSecondPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(2,3,1);
        Assertions.assertEquals(3, maximumNumber.testMaximumNumber());
    }
    @Test
    void givenThreeInteger_WithMaxAtThirdPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(1,2,3);
        Assertions.assertEquals(3, maximumNumber.testMaximumNumber());
    }

    @Test
    void givenThreeFloat_WithMaxAtFirstPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(3.3f,3.2f,3.1f);
        Assertions.assertEquals(3.3f, maximumNumber.testMaximumNumber());
    }

    @Test
    void givenThreeFloat_WithMaxAtSecondPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(3.2f,3.3f,3.1f);
        Assertions.assertEquals(3.3f, maximumNumber.testMaximumNumber());
    }

    @Test
    void givenThreeFloat_WithMaxAtThirdPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber(3.1f,3.2f,3.3f);
        Assertions.assertEquals(3.3f, maximumNumber.testMaximumNumber());
    }

    @Test
    void givenThreeString_WithMaxAtFirstPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber("abcd","abc", "ab");
        Assertions.assertEquals("abcd", maximumNumber.testMaximumNumber());
    }
    @Test
    void givenThreeString_WithMaxAtSecondPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber("abc","abcd", "ab");
        Assertions.assertEquals("abcd", maximumNumber.testMaximumNumber());
    }

    @Test
    void givenThreeString_WithMaxAtThirdPlace_ReturnMaximum_GenericTest() {
        MaximumNumber maximumNumber = new MaximumNumber("abc","ab", "abcd");
        Assertions.assertEquals("abcd", maximumNumber.testMaximumNumber());
    }



}
