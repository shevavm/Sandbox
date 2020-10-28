//5.1
fun main(args: Array<String>) {
    //5.2 println({
    //5.3 val greetingFunction: ()->String= {
    val greetingFunction: (String)->String= {playerName ->
        val currentYear = 2018
        //5.3 "Welcome to SimVillage, Mayor! (copiright $currentYear)"
        "Welcome to SimVillage, $playerName! (copiright $currentYear)"
    }//5.2 }())
    //5.3 "Guyal"
    println(greetingFunction("Guyal"))
}