//5.1
fun main(args: Array<String>) {
    //5.2 println({
    val greetingFunction: ()->String= {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copiright $currentYear)"
    }//5.2 }())
    println(greetingFunction())
}