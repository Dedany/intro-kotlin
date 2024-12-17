package Array


//Crea una función que dado un conjunto de String añada un nuevo
// elemento que se le pase y devuelva el nuevo array

fun exercise5() {


    println("introduce una palabra o frase")
    val firstWord = readLine() ?: ""




    println("introduce algo más")
    val secondword2 = readLine() ?: ""

    println("ahora mismo tienes : $firstWord $secondword2")

    println("introduce la palabra o frase que quieras introducir")
    val newWord = readLine() ?: ""

    val array = listOf(firstWord, secondword2, newWord)

    println(array.joinToString(" "))

}

fun main() {
    exercise5()
}

