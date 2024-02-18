import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean result;


    public LionParametrizedTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Object[][] test() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Test",true},
        };
    }

    @Test
    public void testLion(){
        try{
            Lion lion = new Lion(sex);
            Assert.assertEquals(lion.doesHaveMane(),result);}
        catch (Exception exception)
        {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }



    }
}