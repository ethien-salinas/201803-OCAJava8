import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAppHasAGreeting() {
        App app = new App();
        assertNotNull("app should have a greeting", app.getGreeting());
        assertEquals("Hello world with Gradle.", app.getGreeting());
        assertTrue(app.getGreeting().length() == 24);
    }

    @Test
    void testNumbersOperations() {
        int precedence = 25 - 5 * 4 / 2 - 10 + 4;
        int precedenceOverriden = (((25 - 5) * 4) / (2 - 10)) + 4;
        assertEquals(9, precedence);
        assertEquals(-6, precedenceOverriden);
    }

}
