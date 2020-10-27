const val MAX_EXPERIENCE: Int=5000
//2.10
//2.1 main +Tab
fun main(args: Array<String>) {
    //2.2 змінна var з типом Int та ім'ям experiencePoints
    //оператор присвоювання (=)
    //list 2.3-2.4 Int=(integers)=цілі числа, інші типи не годяться
    val playerName ="Estragon"
    var experiencePoints =5
    experiencePoints += 5
    //2.5 оператор додавання з привласненням (+=)
    println(experiencePoints)
    //2.6 val, vals - змінна, доступна тільки для читання
    // var, vars - змінна, яка може змінюватися
    /*Якщо типи як String, Int виділені сірим кольором , компілятор
    * автоматично визначив типи і їх можна прибрати.
    * Клікнути на :String :Int і натисніть alt+enter.
    * Потім клікніть в меню на "Remove exclicit type specification"
    * ":String" щезне, як і ":Int"
    * Для визначення типу змінних клікніть на на її імені і натисніть ctrl+shift+P
    * */
    println(playerName)

}