package za.ac.cput.assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;
    private Employee emp; //Second employee object for 'Object Equality'

    @Before
    public void setUp() throws Exception {
        //Object of the Employee class

        employee = new Employee.Builder().empId("1").
                empName("Sizwe").
                empSurname("Ncikana").
                empAddress("79 water crest").build();

        emp = new Employee.Builder().empId("1").
                empName("Sizwe").
                empSurname("Ncikana").
                empAddress("79 water crest").build();

    }

    @Test
    public void getEmpId() {
        Assert.assertEquals(employee.getEmpId(), "2");
    }

    @Test
    public void getEmpName() {
        Assert.assertEquals(employee.getEmpName(), "Odwa");
    }

    @Test
    public void getEmpSurname() {
        Assert.assertEquals(employee.getEmpSurname(), "Ncikana");
    }

    @Test
    public void getAddress() {
        Assert.assertEquals(employee.getAddress(), "2409 Potgieter");
    }

    //Object Equality - Testing 2 Objects (Employee, emp)
    @Ignore // Disabling Test
    @Test
    public void testObjectEquality(){
        Assert.assertEquals(employee, emp);
    }

    //Object Identity
    @Test (timeout = 30000)
    public void objectIdentity(){
        emp = employee;
        Assert.assertSame(emp, employee);

        while (true);
    }

    //Failing test.. Making a passed method to pass by throwing an exception
    @Test(expected = IllegalAccessError.class)
    public void failingTest(){
        Assert.assertEquals(employee.getEmpName(), employee.getEmpName());
    }



}