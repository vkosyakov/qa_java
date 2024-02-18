
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;
    @Spy
    Lion lion = new Lion(feline);

    @Test
    public void testGetFoodLion() throws Exception{
       lion.getFood();
       Mockito.verify(lion,Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testGetKittensLion(){
        Lion lion = new Lion(feline);
        lion.getKittensLion();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

}
