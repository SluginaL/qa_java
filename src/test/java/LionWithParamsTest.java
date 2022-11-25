import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;
import com.example.Feline;
import com.example.Lion;

@RunWith(Parameterized.class)
public class LionWithParamsTest {
    private final String gender;
    private final boolean expected;

    public LionWithParamsTest(String gender, boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] lionIsCreateData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionIsCreate() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(gender, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}