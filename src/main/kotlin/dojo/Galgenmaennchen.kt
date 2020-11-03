package dojo

import java.lang.StringBuilder

class Galgenmaennchen(val gesuchtesWort: String) {

    /*
     * 1. Prüfe an welcher Stelle des gesuchten Worts das Zeichen vorkommt.
     * 2. Gebe die bisherigen erratenen Bestandteile des Worts
     * in der Form "--x--xy-" zurück.
     */

    //
    fun rateBuchstabe(buchstabe: Char): String {
        val sb = StringBuilder()
        for (i in 0 until gesuchtesWort.length) {
            if (gesuchtesWort[i] == buchstabe) {
                sb.append(buchstabe)
            } else {
                sb.append("-")
            }
        }
        return sb.toString()
    }


}