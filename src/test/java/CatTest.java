
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline;


    //тест проверяет что вызвали мето eatMeat() класса Feline 1 раз
    @Test
    public void testGetFoodCat() throws Exception{
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline,Mockito.times(1)).eatMeat();

    }

    //тест проверяет, что привызове метола getSound класса Cat, выводится строка "Мяу"
    @Test
    public void testGetSound(){
        Cat cat = new Cat(feline);
        Assert.assertEquals(cat.getSound(),"Мяу");
    }


}
