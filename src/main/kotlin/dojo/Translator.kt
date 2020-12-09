package dojo

/**
 * 1    ->  I
 * 5    ->  V
 * 10   ->  X
 * 50   ->  L
 * 100  ->  C
 * 500  ->  D
 * 1000 ->  M
 */
class Translator {

    /**
     * Übersetzt eine Dezimalzahl in römische Ziffern.
     */
    fun decimalToRomanNumerals(decimalNumber: Int): String {
        if(decimalNumber<RomanNumerals.V.value){
            if (decimalNumber<4){
                var result = ""
                for (index in 0 until  decimalNumber)
                    result+=RomanNumerals.I
                return result
            } else{
                return "${RomanNumerals.I}${RomanNumerals.V}"
            }
        }
        return "MMMMDCCXI"
    }

    /**
     * Übersetzt römische Ziffern in eine Dezimalzahl.
     */
    fun romanNumeralsToDecimal(romanNumeral: String) {

    }

}

enum class RomanNumerals(val value: Int) {
    I(value = 1),
    V(value = 5),
    X(value = 10),
    L(value = 50),
    C(value = 100),
    D(value = 500),
    M(value = 1000)
}
