//5.1
fun main(args: Array<String>) {
    //5.2 println({
    //5.3 val greetingFunction: ()->String= {
    //5.4 val greetingFunction: (String)->String= {playerName ->
    //5.5 val greetingFunction: (String)->String= {
    //5.6 val greetingFunction: (String, Int)->String= {playerName, numBuildings ->
    //5.8
    //val greetingFunction = {playerName: String, numBuildings: Int ->
    //5.12 ::printConstructionCost
    /*5.13 runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        //5.3 "Welcome to SimVillage, Mayor! (copiright $currentYear)"
        //5.4 "Welcome to SimVillage, $playerName! (copiright $currentYear)"
        //5.5 "Welcome to SimVillage, $it! (copiright $currentYear)"
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copiright $currentYear)"
    }//5.2 }())*/
    runSimulation()//5.13
    //5.3 "Guyal"
    //5.5 println(greetingFunction("Guyal"))
    //5.7 println(greetingFunction("Guyal", 2))

    //5.8 ? runSimulation ("Guyal", greetingFunction)
}
//5.9 inline
//5.10 inline fun runSimulation (playerName: String, greetingFunction: (String, Int) -> String) {
/*5.13 inline fun runSimulation (
        playerName: String,
        costPrinter: (Int) -> Unit,//5.10
        greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() //випадковий вибір 1,2 або 3
    costPrinter (numBuildings)//5.10
    println(greetingFunction(playerName, numBuildings))
}*/
fun runSimulation (){
    val greetingFunction = configureGreetingFunction ()
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction (): (String) -> String {
    val structureType = "hospitals"
    var numBuilding = 5
    return {playerName: String ->
        val currentYear = 2018
        numBuilding += 1
        println("Adding $numBuilding $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
//5.10
fun printConstructionCost (numBuilding: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuilding}")
}