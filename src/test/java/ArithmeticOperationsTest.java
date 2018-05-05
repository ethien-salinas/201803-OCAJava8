import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

    @Test
    @DisplayName("Math operations tests")
    void testNumbersOperations() {
        int precedence = 25 - 5 * 4 / 2 - 10 + 4;
        int precedenceOverriden = (((25 - 5) * 4) / (2 - 10)) + 4;
        assertThat(precedence).isEqualTo(9);
        assertThat(precedenceOverriden).isEqualTo(-6);
    }
}
