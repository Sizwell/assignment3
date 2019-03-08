package za.ac.cput.assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeOutTest {
    TimeOut to;

    @Before
    public void setUp() throws Exception {
        to = new TimeOut.Builder()
                .timer("10").build();
    }

    @Test (timeout = 10000)
    public void getTimer() {
        Assert.assertEquals(to.getTimer(), "10");
        while (true);
    }
}