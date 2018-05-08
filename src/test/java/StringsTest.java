import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringsTest {

    @Test
    @DisplayName("String methods test")
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
    @DisplayName("StringBuilder methods test")
    void testStringBuilderMethods(){
        StringBuilder certificatic = new StringBuilder("Certificatic");
        certificatic.append(" rules!");
        // not equal because a StringBuilder is not a String although the content is the same
        assertThat(certificatic).isNotEqualTo("Certificatic rules!");
        // not equal because two new StringBuilder have different memory locations
        assertThat(certificatic).isNotEqualTo(new StringBuilder("Certificatic rules!"));
        // equals because we are comparing the content of two StringBuilder
        assertThat(certificatic.toString()).isEqualTo(new StringBuilder("Certificatic rules!").toString());
    }

}
