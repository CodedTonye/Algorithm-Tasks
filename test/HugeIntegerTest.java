import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    @Test
    public void testThatItCanParseAndDisplayNumber() {
        HugeInteger number = new HugeInteger();

        number.parse("12345");

        String expected = "12345";
        String actual = number.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testThatItCanAddTwoHugeIntegers() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("12345");
        number2.parse("67890");

        HugeInteger result = number1.add(number2);

        String expected = "80235";
        String actual = result.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testThatItCanSubtractTwoHugeIntegers() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("67890");
        number2.parse("12345");

        HugeInteger result = number1.subtract(number2);

        String expected = "55545";
        String actual = result.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testThatTwoHugeIntegersAreEqual() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("12345");
        number2.parse("12345");

        boolean expected = true;
        boolean actual = number1.isEqualTo(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatTwoHugeIntegersAreNotEqual() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("12345");
        number2.parse("54321");

        boolean expected = true;
        boolean actual = number1.isNotEqualTo(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatFirstNumberIsGreaterThanSecondNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("500");
        number2.parse("400");

        boolean expected = true;
        boolean actual = number1.isGreaterThan(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatFirstNumberIsLessThanSecondNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("400");
        number2.parse("500");

        boolean expected = true;
        boolean actual = number1.isLessThan(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatFirstNumberIsGreaterThanOrEqualToSecondNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("500");
        number2.parse("500");

        boolean expected = true;
        boolean actual = number1.isGreaterThanOrEqualTo(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatFirstNumberIsLessThanOrEqualToSecondNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();

        number1.parse("400");
        number2.parse("500");

        boolean expected = true;
        boolean actual = number1.isLessThanOrEqualTo(number2);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatNumberIsZero() {
        HugeInteger number = new HugeInteger();

        number.parse("0");

        boolean expected = true;
        boolean actual = number.isZero();

        assertEquals(expected, actual);
    }

    @Test
    public void testThatNumberIsNotZero() {
        HugeInteger number = new HugeInteger();

        number.parse("12345");

        boolean expected = false;
        boolean actual = number.isZero();

        assertEquals(expected, actual);
    }
}