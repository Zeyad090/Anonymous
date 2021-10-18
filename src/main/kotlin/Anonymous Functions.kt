fun main() {
    val numLetters = "Mississippi".count()
    print(numLetters)
    val numLetters = "Mississippi".count({ letter ->
        letter == 's'
    })
    print(numLetters)

}
//====================
fun main() {
    println(
        {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        }()
    )
}
// =============
{
    val currentYear = 2018
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"
}
val currentYear = 2018
"Welcome to SimVillage, Mayor! (copyright $currentYear)"
}()
//Run SimVillage.kt’s main function

//===========
fun main() {
    val greetingFunction: () -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(greetingFunction())

}

//=============
val greetingFunction: () -> String = {
    val currentYear = 2018
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"
}
val greetingFunction: (String) -> String = { playerName ->
    val currentYear = 2018
    "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    println(greetingFunction("Guyal"))

    //================

    val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, $it! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))
}

//===========

val greetingFunction: (String, Int) -> Unit = { playerName, numBuildings ->
    val currentYear = 2018
    println("Adding $numBuildings houses")
    "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        {  println(greetingFunction("Guyal", 2))
    }

    //======================================
    val greetingFunction: () -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        {
            //=========

            val greetingFunction = {
                val currentYear = 2018
                "Welcome to SimVillage, Mayor! (copyright $currentYear)"
            }


}

        //===========

fun main()
{
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2))
}
        Run SimVillage.kt
                //=========

}
//==========





