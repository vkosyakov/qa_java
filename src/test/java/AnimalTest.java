import com.example.Animal;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    //перенес проверку в непараметризованный тест
    @Test
    public void animalThrowsException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Test");
        });
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}
