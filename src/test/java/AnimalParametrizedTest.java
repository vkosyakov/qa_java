import com.example.Animal;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private final List<String> eat;
    private final String animalKind;

    public AnimalParametrizedTest(List<String> eat, String animalKind) {
        this.eat = eat;
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] test() {
        return new Object[][]{
                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},
        };
    }

    @Test
    public void testAnimal() throws Exception{
            Animal animal = new Animal();
            Assert.assertEquals(animal.getFood(animalKind), eat);

    }

    @Test
    public void animalThrowsException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Test");
        });
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}
