package datetime;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TimeTest {
    @Test
    public void testGetDifference() throws Exception {
        Time t1 = new Time(1,30,50);
        Time t2 = new Time(1,40,50);
        String expected = "0:10:0";

        String actual = t1.getDifference(t2);

        assertEquals(actual,expected);
    }

    @Test
    public void testGetDifference1() throws Exception {
        Time t1 = new Time(2,45,20);
        Time t2 = new Time(1,30,10);
        String expected = "1:15:10";

        String actual = t1.getDifference(t2);

        assertEquals(actual,expected);
    }

    @Test
    public void testGetDifference2() throws Exception {
        Time t1 = new Time(2,45,20);
        Time t2 = new Time(2,50,10);
        String expected = "0:4:50";

        String actual = t1.getDifference(t2);

        assertEquals(actual,expected);
    }

    @Test
    public void testGetCurrentTim() throws Exception {
        Time t1 = new Time(2,45,20);
        String expected = "2:45:20";

        String actual = t1.getCurrentTime();

        assertEquals(actual,expected);
    }
}
