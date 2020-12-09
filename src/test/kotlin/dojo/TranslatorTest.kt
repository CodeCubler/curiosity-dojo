package dojo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class TranslatorTest {

    @ParameterizedTest
    @CsvSource(value = [
        "4711,MMMMDCCXI",
        "1,I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V"
    ])
    internal fun `decimal to roman`(input: Int, expected: String) {

        val translator = Translator()

        val romanNumeral: String = translator.decimalToRomanNumerals(input)

        assertThat(romanNumeral).isEqualTo(expected)

    }

}
