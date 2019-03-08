package za.ac.cput.assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student stud;
    private Student std;

    @Before
    public void setUp() throws Exception
    {
        stud = new Student.Builder()
                .stud_num("2")
                .stud_name("Chris")
                .stud_Surname("Dyantyi")
                .stud_phone("0717557292")
                .stud_address("134 Mocking bird")
                .build();

        std = new Student.Builder()
            .stud_num("2")
            .stud_name("Chris")
            .stud_Surname("Dyantyi")
            .stud_phone("0717557292")
            .stud_address("134 Mocking bird")
            .build();
    }

    @Test
    public void getStudNum()
    {
        Assert.assertEquals(stud.getStudNum(), "2");
    }

    @Test
    public void getStudName()
    {
        Assert.assertEquals(stud.getStudName(), "Chris");
    }

    @Test
    public void getStudSurname()
    {
        Assert.assertEquals(stud.getStudSurname(), "Dyantyi");
    }

    @Test
    public void getStudPhone()
    {
        Assert.assertEquals(stud.getStudPhone(), "0785100865");
    }

    @Test
    public void getStudAddress()
    {
        Assert.assertEquals(stud.getStudAddress(), "79 Water crest");

    }

    @Test
    public void objectEquality()
    {
        Assert.assertEquals(stud, std);

    }

    @Test (timeout = 20000)
    public void objectIdentity()
    {
        std = stud;
        Assert.assertSame(std, stud);
        while (true);
    }

    @Test(expected = IllegalAccessError.class)
    public void failingTest(){
        Assert.assertEquals(stud.getStudNum(), stud.getStudNum());
    }

}