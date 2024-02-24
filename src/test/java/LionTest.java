
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    int actual = 3;
    String sex = "Самец";


    @Spy
    Feline feline;
    @Spy
    Lion lion = new Lion(sex,feline);

    public LionTest() throws Exception {
    }


    @Test
    public void testGetFoodLion() throws Exception{
       lion.getFood();
       Mockito.verify(lion,Mockito.times(1)).getFood("Хищник");
    }

    //после того как изменил конструктор добавил правки в тесты
    @Test
    public void testGetKittensLion() throws Exception {
        Lion lion = new Lion(sex,feline);
        lion.getKittensLion();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        //проверка на кол-во котят, проверил мутационным тестирование, что проверка срабаьывает
        Assert.assertEquals(lion.getKittensLion(),1);
    }

    //Проверка на котят
    @Test
    public void testGetKittensWithParametrs(){
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(actual),actual);
    }

    //перенес проверку в непараметризованный тест
    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Test", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
