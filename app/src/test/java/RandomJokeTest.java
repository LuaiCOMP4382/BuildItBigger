import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Before;
import org.junit.Test;

public class RandomJokeTest {

    private String randomJoke;

    @Before
    public void setUp() {
        randomJoke = MainActivity.sRandomJoke;
    }

    @Test
    public void verifyRandomJokeIsNotEmpty() {

        assert !randomJoke.equals("");
    }

}
