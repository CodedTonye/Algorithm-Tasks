import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceArrayTest {

    @Test
    public void testThatMethodReturnsShortedWordFromSentence() {

        String sentence = "Barca is the best club ever in the world";

        String expected = "is";

        String actual = SentenceArray.getShortestWord(sentence);

        assertEquals(expected, actual);
    }

}