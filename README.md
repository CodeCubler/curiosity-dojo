# Übersetzer römischer Zahlen

**1. DOJO**<br>
In einem (Coding)-Dojo werden gemeinschaftlich Programmierübungen testgetrieben bearbeitet. <br>
Dabei steht jedem Teilnehmer nacheinander ein Zeitfenster (Timebox) von 5 Minuten zur Verfügung. <br>
Wir werden nach dem "Driver-Navigator-Prinzip" arbeiten. <br>
Das bedeutet, dass jeweils ein Teilnehmer (der Navigator), sagt, was programmiert werden soll und der Driver diese Anweisungen umsetzt. <br>
Nach dem Ablauf der Timebox wechseln die Rollen: Der Driver wird nun Navigator und ein neuer Teilnehmer wird zum Driver. <br>
Das geschieht auch, wenn ein neuer roter Test geschrieben wurde, nachdem ein vorheriger grün gemacht wurde. <br>

Testgetrieben heißt hier konkret: <br> 
a. Roten Test schreiben <br>
b. Test ausführen (mit rotem Ergebnis) <br>
c. Code implementieren <br>
d. Test erneut ausführen (mit grünem Ergebnis) <br>

**2. Code With Me** <br>
"Code With Me" ist ein Plugin für IntelliJ mit welchem wir bei dem Dojo arbeiten wollen. <br> 
Es ermöglicht das gemeinschaftliche, simultane Arbeiten an einem Projekt bzw. Code. <br>
Um "Code With Me" verwenden zu können muss über die Einstellungen von IntelliJ das Plugin heruntergeladen werden (Strg + Alt + S : File | Settings | Plugins). <br>
Das Plugin taucht dann in IntelliJ oben rechts auf. <br>
Klickt man dort drauf kann man die Option "Join another IDE as participant" auswählen. <br>
Vom Organisator wird ein Einladungs-Link zur Verfügung gestellt, der dort eingegeben werden muss. <br>
Beim erfolgreichen Verbinden öffnet sich daraufhin ein neues (reduziertes) IDE-Fenster in dem nun mit anderen Teilnehmer gleichzeitig gearbeitet werden kann. <br>

**3. Aufgabe** <br>
Schreibe Funktionen zum Übersetzen von römischen Zahlen in Dezimalzahlen und umgekehrt. <br>
Dabei haben die Zahlen folgende Zuordnung: <br>

 * 1    ->  I
 * 5    ->  V
 * 10   ->  X
 * 50   ->  L
 * 100  ->  C
 * 500  ->  D
 * 1000 ->  M
 
"Es handelt sich um eine additive Zahlschrift, mit ergänzender Regel für die subtraktive Schreibung bestimmter Zahlen, aber ohne Stellenwertsystem und ohne Zeichen für Null." [https://de.wikipedia.org/wiki/R%C3%B6mische_Zahlschrift , 30.10.20] <br>

D.h. Zeichen, die kleiner sind als das vorherige werden addiert (XI => X + I => 10 + 1 = 11) und von Zeichen, die größer sind als das vorherige, wird das vorherige abgezogen (XL => L - X => 50 - 10 = 40). <br>

Quellen: <br>
https://ccd-school.de/coding-dojo/function-katas/from-roman-numerals/ <br>
https://ccd-school.de/coding-dojo/function-katas/to-roman-numerals/ <br>