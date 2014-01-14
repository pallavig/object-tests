package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EqualsTest {
    //Correct Implementation

    @Test
    public void testEqualsFunctionalityWithSamePersonData() throws Exception {
        Person prateek1 = new Person("prateek",18);
        Person prateek2 = new Person("prateek",18);

        assert(prateek1.equals(prateek2));
        assert(prateek2.equals(prateek1));
        assertEquals(false, prateek1 == prateek2);
    }

    @Test
    public void testEqualsFunctionalityWithDifferentPersonData() throws Exception {
        Person prateek1 = new Person("prateek",18);
        Person prateek2 = new Person("prateekj",18);

        assertEquals(false,prateek1.equals(prateek2));
        assertEquals(false,prateek2.equals(prateek1));
        assertEquals(false,prateek1 == prateek2);
    }

    @Test
    public void testEqualsFunctionalityWithSamePersonReference() throws Exception {
        Person prateek1 = new Person("prateek",18);
        Person prateek2 = prateek1;

        assert(prateek1.equals(prateek2));
        assert(prateek2.equals(prateek1));
        assert(prateek1 == prateek2);
    }

    @Test
    public void testEqualsFunctionalityWhenOneOfReferencesIsNullGivesStatusUnequal() throws Exception {
        Person prateek1 = new Person("prateek",18);
        Person prateek2 = null;
        assertEquals(false,prateek1.equals(prateek2));
    }


    //Wrong Implementation
    @Test
    public void testGivesStatusUnequalForSameReferences() throws Exception {
        WrongPerson pallavi = new WrongPerson("pallavi",101);


        assertEquals(false,pallavi.equals(pallavi));

    }

    @Test
    public void testGivesStatusUnequalForTwoPersonsHavingSameData() throws Exception {
        WrongPerson pallavi1 = new WrongPerson("pallavi",101);
        WrongPerson pallavi2 = new WrongPerson("pallavi",101);

        assertEquals(false,pallavi1.equals(pallavi2));
    }

}