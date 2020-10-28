//5.1
fun main(args: Array<String>) {
    //5.2 println({
    //5.3 val greetingFunction: ()->String= {
    //5.4 val greetingFunction: (String)->String= {playerName ->
    //5.5 val greetingFunction: (String)->String= {
    val greetingFunction: (String, Int)->String= {playerName, numBuildings ->
        val currentYear = 2018
        //5.3 "Welcome to SimVillage, Mayor! (copiright $currentYear)"
        //5.4 "Welcome to SimVillage, $playerName! (copiright $currentYear)"
        //5.5 "Welcome to SimVillage, $it! (copiright $currentYear)"
        println("Adding $numBuildings houses`")
        "Welcome to SimVillage, $playerName! (copiright $currentYear)"
    }//5.2 }())
    //5.3 "Guyal"
    //5.5 println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal", 2))
}