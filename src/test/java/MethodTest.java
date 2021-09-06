import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTest {

    private String toRoman(int i) {
        return "I";
    }

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1), "Should return I");

    }



    @Test
    void shouldConvert2toII() {
        assertEquals("II", toRoman(2), "Should return II");
    }
}
