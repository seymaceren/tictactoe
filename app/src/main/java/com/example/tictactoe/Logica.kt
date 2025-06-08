package com.example.tictactoe

class Logica {
    public enum class beurt {     // Enum om de beurt van de speler bij te houden
        eenO,
        eenX
    } // Winnende combinaties voor speler X
    private var combinatiesX = mutableListOf(mutableListOf("1", "2", "3"),
        mutableListOf("4", "5", "6"),
        mutableListOf("7", "8", "9"),
        mutableListOf("1", "4", "7"),
        mutableListOf("2", "5", "8"),
        mutableListOf("3", "6", "9"),
        mutableListOf("1", "5", "9"),
        mutableListOf("3", "5", "7"))
    // Winnende combinaties voor speler O
    private var combinatiesO = mutableListOf(mutableListOf("1", "2", "3"),
        mutableListOf("4", "5", "6"),
        mutableListOf("7", "8", "9"),
        mutableListOf("1", "4", "7"),
        mutableListOf("2", "5", "8"),
        mutableListOf("3", "6", "9"),
        mutableListOf("1", "5", "9"),
        mutableListOf("3", "5", "7"))
   // Past de juiste combinaties aan voor de huidige speler na elke zet
    public fun SetBeurt(spelerBeurt: beurt, tag: String)
    {
        if (spelerBeurt == beurt.eenX)
        {
            SetSpelerBeurt(combinatiesX, tag, "X")
        }
        else
        {
            SetSpelerBeurt(combinatiesO, tag, "O")
        }
    }
    private fun SetSpelerBeurt(combinaties: MutableList<MutableList<String>>, tag: String, zet: String)
    {
        combinaties.forEach {
            for (item in it) {
                if (item == tag) {
                    it.set(it.indexOf(item), zet)
                }
            }
        }
    }
    private fun checkWinnendeCombinatie(combinaties: MutableList<MutableList<String>>, zet: String): Boolean
    {
        combinaties.forEach {
            var teller: Int = 0
            for (item in it) {
                if (item == zet) {
                    teller++
                }
            }
            if (teller == 3) // Als er 3 gelijke tekens in een winnende combinatie is, returnt hij true.
                return true
        }
        return false
    } // Functie om te controleren of de speler gewonnen heeft.
    public fun heeftSpelerGewonnen(spelerBeurt: beurt): Boolean
    {
        if (spelerBeurt == beurt.eenX)
            return checkWinnendeCombinatie(combinatiesX, "X")
        else
            return checkWinnendeCombinatie(combinatiesO, "O")
    }
}