package za.ac.cput.assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentityTest {

    ObjectIdentity oi;

    @Before
    public void setUp() throws Exception {
        oi = new ObjectIdentity.Builder()
                .studName("Mike").build();
    }

    @Test
    public void getName()
    {
        Assert.assertEquals(oi.getName(), "Michael");
    }
}