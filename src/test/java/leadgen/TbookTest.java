package leadgen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TbookTest {
    Tbook tbook;

    @Before
    public void setUp() throws Exception {
        tbook = Tbook.getInstance();
    }

    @After
    public void tearDown() throws Exception {
        tbook.clean();
    }

    @Test
    public void testTest() throws Exception {
        assertEquals(2 + 2, 4);
    }

    @Test
    public void testGetInstance() throws Exception {
        tbook = Tbook.getInstance();
        assertNotEquals(null, tbook);
    }

    @Test
    public void testAddRecord() throws Exception {
        //int c=tbook.capacity()+1;
        tbook.addPerson(new Person("John","Doe","0661111111"));
    }

}