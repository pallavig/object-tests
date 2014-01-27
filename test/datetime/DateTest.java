package datetime;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DateTest {
    @Test
    public void testGetDifferenceWhenFirstDateIsGreater() throws Exception {
        Date date1 = new Date(2000,10,5);
        Date date2 = new Date(2000,10,4);
        assertEquals("0-0-1",date1.getDifference(date2));
    }
}
