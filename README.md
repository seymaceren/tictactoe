## Tic-Tac-Toe app

* **Door:** Şeyma Ceren Yildirim
* **Datum:** 8-6-2025
* **Studentnummer:** 1878084

Mijn Tic-Tac-Toe applicatie heb ik gemaakt met Android Studio. Android Studio is een tool waarmee men applicaties kan maken voor de operating system 'Android'. 
Bij Android Studio kun je kiezen voor de programmeertalen Java of Kotlin of beide, ik heb ervoor gekozen om mijn Tic-Tac-Toe applicatie te maken met de programmeertaal Kotlin. 
Dit omdat Kotlin voor Android Studio de meest aangeraade programmertaal is, vanwege het feit dat Kotlin compacter is dan Java.

De applicatie bestaat uit twee modules. Die zijn MainActivity en Logica. Bij Android applicaties wordt eerst de MainActivity.onCreate event aangeroepen en de UI geinitialisserd.
Class Logica zorgt er voor de winnende combinaties en de spelregels toegepast wordt. De UI-interface is gemaakt in activity_main.xml die gekoppeld is aan MainActivity.kt via de static functie inflate van class ActivityMainBinding. 

Het spel kan alleen door twee spelers worden gespeeld. Het bord bestaat uit drie bij drie vakjes, één van de spelers kiest voor het teken x en de andere speler kiest voor het teken O. Om de beurt zetten de spelers hun teken in een vakje,
om te kunnen winnen moet één van de speler drie van zijn/haar tekens op een rij hebben, dat kan horizontaal verticaal of diagonaal. Als beide spelers niet drie van hun tekens op een rij hebben, dan hebben ze allebei niet gewonnen.
Het spel kan altijd herstart worden ongeacht hoe vaak het spel afgelopen is en ongeacht het spel wel of niet voorbij is. 
