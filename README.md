# Galgenmännchen (test commit robert)
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

**3. Aufgabe: Galgenmännchen** <br>
Bei dieser Aufgabe wird eine Klasse implementiert, der man bei der Initialisierung ein zu suchendes Wort mitgibt. <br>
Dieses wird dann durch einen Methoden-Aufruf dieser Klasse kontinuierlich erraten. <br>
Dabei wird ein Buchstabe übergeben und der bisher erratende Stand zurückgegeben. <br>
Sprich, bei dem Wort "Programm" wurde der Buchstabe "o" erraten, die Methode liefert "--o-----" zurück. <br>
Beim nächsten mal wird "r" erraten - es wird "-ro-r---" zurückgegeben usw. bis das Wort komplett erraten wurde. <br>

Quelle: <br>
https://ccd-school.de/coding-dojo/class-katas/galgenmaennchen/ <br>