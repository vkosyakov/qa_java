import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    Feline feline;
    private final boolean result;


    public LionParametrizedTest(String sex, Feline feline, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] test() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLion() throws Exception {
        Lion lion = new Lion(sex,feline);
        Assert.assertEquals(lion.doesHaveMane(), result);
    }


}