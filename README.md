# Übersetzer römischer Zahlen

Schreibe Funktionen zum Übersetzen von römischen Zahlen in Dezimalzahlen und umgekehrt.
Dabei haben die Zahlen folgende Zuordnung:

 * 1    ->  I
 * 5    ->  V
 * 10   ->  X
 * 50   ->  L
 * 100  ->  C
 * 500  ->  D
 * 1000 ->  M
 
"Es handelt sich um eine additive Zahlschrift, mit ergänzender Regel für die subtraktive Schreibung bestimmter Zahlen, aber ohne Stellenwertsystem und ohne Zeichen für Null." [https://de.wikipedia.org/wiki/R%C3%B6mische_Zahlschrift , 30.10.20]

D.h. Zeichen, die kleiner sind als das vorherige werden addiert (XI => X + I => 10 + 1 = 11) und von Zeichen, die größer sind als das vorherige, wird das vorherige abgezogen (XL => L - X => 50 - 10 = 40).  