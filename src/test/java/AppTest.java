import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Greeting tests")
    void testAppHasAGreeting() {
        App app = new App();
        assertThat(app.getGreeting()).isNotNull();
        assertThat(app.getGreeting()).isEqualTo("Hello world with Gradle.");
        assertThat(app.getGreeting()).hasLength(24);
    }

    @Test
    @DisplayName("Math operations tests")
    void testNumbersOperations() {
        int precedence = 25 - 5 * 4 / 2 - 10 + 4;
        int precedenceOverriden = (((25 - 5) * 4) / (2 - 10)) + 4;
        assertEquals(9, precedence, "the natural order of precedence");
        assertEquals(-6, precedenceOverriden, "precedence order overridden");
    }

}
