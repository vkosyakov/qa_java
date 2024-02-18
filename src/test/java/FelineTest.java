
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;


@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    // поля для проверки теста testGetKittensWithParametrs
    int actual = 3;
    @Spy
    Feline feline;

    //тест проверят, что метод eatMeat() вызывает метод getFood("Хищник") один раз
    @Test
    public void testEatMeat() throws Exception{
        feline.eatMeat();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }
    //тест проверяет, что метод getLittens() вызывает метод getKittens(1) c параметром "1" один раз
    @Test
    public void testGetKittens(){
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }

    // тест проверяет, что при вызове метода getFamily класса Feline выводится строка "Кошачьи"
    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Test
    public void testGetKittensWithParametrs(){
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(actual),actual);
    }

}
