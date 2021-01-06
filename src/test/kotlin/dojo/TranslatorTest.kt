package dojo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class TranslatorTest {

    @ParameterizedTest(name = "{index} => decimalNumber ''{0}'' to romanNumeral ''{1}''")
    @CsvSource(
        value = [
            "1,I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9,IX",
            "10, X",
            "34, XXXIV",
            "44, XLIV",
            "4711, MMMMDCCXI",
            "9999, MMMMMMMMMCMXCIX"
        ]
    )
    internal fun `decimal to roman`(input: Int, expected: String) {

        val translator = Translator()

        val romanNumeral: String = translator.decimalToRomanNumerals(input)

        assertThat(romanNumeral).isEqualTo(expected)

    }

}
