import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class sockMerchantTest {
    static final sockMerchant TEST = new sockMerchant();

    @Test
    public void shouldCheckIfNumberIsEvenOrOdd(){
        assertTrue("true", TEST.evenOrOdd(4));
        assertFalse("false", TEST.evenOrOdd(3));
    }

    @Test
    public void shouldReturnTrueIfArrayIsEmpty() {

        List<Integer> mockedListOne = Collections.singletonList(3);
        List<Integer> mockedSequence = Collections.singletonList(2);

        assertTrue("true",TEST.isValidSubsequence(mockedListOne, mockedSequence));
    }

    @Test
    public void shouldReturnFalseIfThereAreNoMatches() {
        List<Integer> array = Arrays.asList(2,4,5,7,23,6,7,29,2);
        List<Integer> sequence = Arrays.asList(3,1,11,222,55);

        assertFalse("false", TEST.isValidSubsequence(array, sequence));
    }


    @Test
    public void shouldReturnTrueIfThereIsASequence() {
        List<Integer> array = Arrays.asList(2,4,5,7,23,6,7,29,2);
        List<Integer> sequence = Arrays.asList(2,4,5,7,23,6,7,29,2);
        assertTrue("true", TEST.isValidSubsequence(array, sequence));
    }



}
