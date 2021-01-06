package dojo

import java.util.*

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

    private var romanTokenMap: TreeMap<Int, String>

    init {
        romanTokenMap = TreeMap()

        romanTokenMap[1000] = "M"
        romanTokenMap[900] = "CM"
        romanTokenMap[500] = "D"
        romanTokenMap[400] = "CD"
        romanTokenMap[100] = "C"
        romanTokenMap[90] = "XC"
        romanTokenMap[50] = "L"
        romanTokenMap[40] = "XL"
        romanTokenMap[10] = "X"
        romanTokenMap[9] = "IX"
        romanTokenMap[5] = "V"
        romanTokenMap[4] = "IV"
        romanTokenMap[1] = "I"
    }


    /**
     * Übersetzt eine Dezimalzahl in römische Ziffern.
     */
    fun decimalToRomanNumerals(decimalNumber: Int): String {

        val pointer = romanTokenMap.floorKey(decimalNumber)

        if(decimalNumber == pointer){
            return romanTokenMap[pointer]!!
        }else{
            return romanTokenMap[pointer] + decimalToRomanNumerals(decimalNumber - pointer)
        }

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
