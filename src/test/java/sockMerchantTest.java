import org.junit.Test;

import static org.junit.Assert.*;

public class sockMerchantTest {
    static final sockMerchant TEST = new sockMerchant();


    @Test
    public void shouldReturnInteger() {
        assertEquals(5, TEST.numberOfMatches(5));
    }

    @Test
    public void shouldCheckIfNumberIsEvenOrOdd(){
        assertTrue("true", TEST.evenOrOdd(4));
        assertFalse("false", TEST.evenOrOdd(3));
    }


}
