import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "mka";
    private static final String LAST_NAME = "katrak";

    @Test
    public void testFirstName() {
        final Person person = new Person();
        person.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, person.getFirstName());
    }

    @Test
    public void testLastName() {
        final Person person = new Person();
        person.setLastName(LAST_NAME);
        Assert.assertEquals(LAST_NAME, person.getLastName());
    }
}
