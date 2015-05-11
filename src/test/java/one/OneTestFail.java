package one;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OneTestFail {

    @Test
    public void testName() throws Exception {
        assertThat(new One().hello(),is(true));

    }
}
