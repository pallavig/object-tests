package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HashCodeTest {

    //correct implementation
    @Test
    public void testHashCodeOfTwoObjectsWithSameDataShouldBeSame() throws Exception {
        Person pallavi1 = new Person("pallavi",97);
        Person pallavi2 = new Person("pallavi",97);

        int hash1 = pallavi1.hashCode();
        int hash2 = pallavi2.hashCode();

        assert(hash1 == hash2);
        assert(pallavi1.equals(pallavi2));
     }

    @Test
    public void testCalculatingHashTwiceOnSameObjectShouldGiveSameValue() throws Exception {
        Person prateek1 = new Person("prateek",18);
        int hash1 = prateek1.hashCode();
        int hash2 = prateek1.hashCode();

        assert(hash1 == hash2);
    }

    //Wrong Implementation
    @Test
    public void testHashCodeGivesDifferentValueOnSameReference() throws Exception {
        WrongPerson pallavi = new WrongPerson("pallavi",97);

        int hash1 = pallavi.hashCode();
        int hash2 = pallavi.hashCode();

        assertEquals(false,hash1 == hash2);
    }
}
