import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertThat(precedence).isEqualTo(9);
        assertThat(precedenceOverriden).isEqualTo(-6);
    }

    @Test
    @DisplayName("Array operations tests")
    void testArraysOperations() {
        String[] names = { "Mary", "Bob", "Carlos" };
        assertThat(names[0]).isEqualTo("Mary");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            String name = names[3];
            name.startsWith("C");
        });
        assertThat(names[2]).isEqualTo("Carlos");
    }

    @Test
    @DisplayName("String operation test")
    void testStringMethods(){
        String phoneNum = "404-543-2345";
        int index = phoneNum.indexOf("-");
        assertThat(index).isEqualTo(3);

        assertThat(phoneNum.indexOf("-", index)).isEqualTo(3);
        assertThat(phoneNum.indexOf("-", index+1)).isEqualTo(7);

        assertThat(phoneNum.substring(4,7)).isEqualTo("543");
        assertThat(phoneNum.substring(8)).isEqualTo("2345");
    }

    @Test
    @DisplayName("StringBuilder operation test")
    void testStringBuilderMethods(){
        StringBuilder certificatic = new StringBuilder("Certificatic");
        certificatic.append(" rules!");

        assertThat(certificatic).isNotEqualTo("Certificatic rules!");
        assertThat(certificatic).isNotEqualTo(new StringBuilder("Certificatic rules!"));
        assertThat(certificatic.toString()).isEqualTo(new StringBuilder("Certificatic rules!").toString());
    }
}
