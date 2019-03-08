package za.ac.cput.assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisablingTestTest {
    DisablingTest dt;

    @Before
    public void setUp() throws Exception {
                                        //This 'ignore' is a method in the DisablingTest class Builder method
        dt = new DisablingTest.Builder().ignoring("Ignored").build();
    }

    @Ignore
    @Test
    public void getIgnoring()
    {
        Assert.assertEquals(dt.getIgnoring(), "Ignored");
    }
}