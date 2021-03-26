import org.codehaus.plexus.util.StringInputStream;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class DresserRulesEngineTest extends Mockito {
    MovieRecommender movies = new MovieRecommender();

    @Test
    public void noMoviesFails() {
        assertFalse(movies.processMovies(new Integer[]{}, 2));
    }


    @Test
    public void singleMovieFails() {
        assertFalse(movies.processMovies(new Integer[]{20}, 20));
    }

    @Test
    public void manyMoviesNoMatchFails() {
        assertFalse(movies.processMovies(new Integer[] {20, 10 , 15}, 10));
    }

    @Test
    public void manyMoviesAllGoodTrue() {
        assertTrue(movies.processMovies(new Integer[] {20, 10, 15, 20, 15}, 30));
    }


    UserInput userInput = Mockito.mock(UserInput.class);;

    @Test
    public void shouldSendEmailWhenInputsMatch() {
        when(userInput.getNextInput()).thenReturn("test");

        MyService myService = new MyService(userInput);

        assertTrue(myService.shouldSendEmail("test"));
    }

    @Test
    public void shouldNotSendEmailWhenInputsDoNotMatch() {
        when(userInput.getNextInput()).thenReturn("not test");
        when(userInput.getNextInput()).thenReturn("not test");
        when(userInput.getNextInput()).thenReturn("not test");
        when(userInput.getNextInput()).thenReturn("not test");
        when(userInput.getNextInput()).thenReturn("not test");

        MyService myService = new MyService(userInput);

        assertFalse(myService.shouldSendEmail("test"));
    }
}
