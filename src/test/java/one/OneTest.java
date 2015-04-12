package one;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OneTest {

    @Test
    public void testName() throws Exception {
        assertThat(new One().hello(),is(true));

    }
}