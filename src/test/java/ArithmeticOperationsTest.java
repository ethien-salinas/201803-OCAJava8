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

    @Test
    @DisplayName("Cast and promotion tests")
    void testCastAndPromotion() {
        int num1 = 55555;
        int num2 = 66666;
        long num3 = num1 * num2;
        assertThat(num3).isNotEqualTo(3_703_629_630L); // not even possible to express 3_703_629_630 as an int
        assertThat(num3).isEqualTo(-591_337_666);

        short aShort = 53;
        short bShort = 47;
        // before to be assigned to cShort, the + operator produces an int
        // without cast the result, the operation do not even compile
        short cShort = (short) (aShort + bShort);
        assertThat(cShort).isEqualTo(100);

        // potential issue with type casting
        long bigLongNumber = 123_987_654_321L;
        int choppedNumber = (int) bigLongNumber;
        assertThat(choppedNumber).isNotEqualTo(123_987_654_321L);
        assertThat(choppedNumber).isEqualTo(-566_397_263);
    }
}
