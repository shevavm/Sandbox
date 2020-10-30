//5.1
fun main(args: Array<String>) {
    //5.2 println({
    //5.3 val greetingFunction: ()->String= {
    //5.4 val greetingFunction: (String)->String= {playerName ->
    //5.5 val greetingFunction: (String)->String= {
    //5.6 val greetingFunction: (String, Int)->String= {playerName, numBuildings ->
    //5.8
    //val greetingFunction = {playerName: String, numBuildings: Int ->
    runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2018
        //5.3 "Welcome to SimVillage, Mayor! (copiright $currentYear)"
        //5.4 "Welcome to SimVillage, $playerName! (copiright $currentYear)"
        //5.5 "Welcome to SimVillage, $it! (copiright $currentYear)"
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copiright $currentYear)"
    }//5.2 }())
    //5.3 "Guyal"
    //5.5 println(greetingFunction("Guyal"))
    //5.7 println(greetingFunction("Guyal", 2))

    //5.8 ? runSimulation ("Guyal", greetingFunction)
}
fun runSimulation (playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() //випадковий вибір 1,2 або 3
    println(greetingFunction(playerName, numBuildings))
}