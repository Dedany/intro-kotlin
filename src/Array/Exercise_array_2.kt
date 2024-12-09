package Array

//Crea una función que dado un conjunto de enteros devuelva
// si existe un número dentro de él
fun InserNum2(array: List<Int>) {


    println("inserta numero para ver si está en el array ")

    val input = readLine()?.toIntOrNull()

    if (input == null) {
        println("introduce un numero válido")
        return
    }
    if (input in array) {
        println("el numero está dentro")
    } else {
        println("no está dentro")
    }

    
}

fun main() {
    val array = listOf(1, 2, 3, 4)

    InserNum2(array)
}