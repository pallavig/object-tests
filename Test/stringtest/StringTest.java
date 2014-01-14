package stringtest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void testWithTwoLiteralsThatHasSameValue() throws Exception {
        String literal1 = "pallavi",literal2 = "pallavi";

        assert(literal1.equals(literal2));
        assert(literal1 == literal2);

    }

    @Test
    public void testWithTwoLiteralsWithDifferentValues() throws Exception {
        String literal1 = "pallavi",literal2 = "pallavig";

        assertEquals(false, literal1.equals(literal2));
    }

    @Test
    public void testWithStringConstructorWithSameValues() throws Exception {
        String string1 = new String("pallavi");
        String string2 = new String("pallavi");

        assert(string1.equals(string2));
        assertEquals(false, string1 == string2);
    }

    @Test
    public void testWithStringConstructorWithDifferentValues() throws Exception {
        String string1 = new String("pallavi");
        String string2 = new String("pallavig");

        assertEquals(false,string1.equals(string2));
        assertEquals(false,string1 == string2);
    }

    @Test
    public void testWithLiteralAndStringConstructorWithSameValues() throws  Exception  {
        String literal = "pallavi";
        String string = new String("pallavi");

        assert(literal.equals(string));
        assertEquals(false,literal == string);
    }

    @Test
    public void testWithLiteralAndStringConstructorWithDifferentValues() throws  Exception  {
        String literal ="pallavi";
        String string = "pallavig";

        assertEquals(false,literal.equals(string));
    }
}
